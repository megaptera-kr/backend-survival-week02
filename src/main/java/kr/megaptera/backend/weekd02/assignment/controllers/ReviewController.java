package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.models.AddReviewRequest;
import kr.megaptera.backend.weekd02.assignment.services.ProductManager;
import kr.megaptera.backend.weekd02.assignment.services.ReviewManager;
import kr.megaptera.backend.weekd02.assignment.services.SessionManager;
import kr.megaptera.backend.weekd02.assignment.services.UserManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/{productId}/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ProductManager productManager;
    private final ReviewManager reviewManager;
    private final SessionManager sessionManager;
    private final UserManager userManager;

    @GetMapping
    public ResponseEntity getAll(@PathVariable long productId) {

        if (!productManager.isExist(productId)) {
            return ResponseEntity.badRequest().body(null);
        }

        var reviews = reviewManager.getAll(productId);
        return ResponseEntity.ok(reviews);
    }

    @PostMapping
    public ResponseEntity add(
            @RequestHeader("Authorization") String authorizationText,
            @PathVariable long productId,
            @RequestBody AddReviewRequest request){

        if (!productManager.isExist(productId)) {
            return ResponseEntity.badRequest().body(null);
        }

        var sessionId = Integer.parseInt(authorizationText);
        var session = sessionManager.get(sessionId);
        if (session == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var user = userManager.get(session.getUserId());
        if (user == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var review = reviewManager.add(productId, user.getName(), request);
        return ResponseEntity.ok(review);
    }

    @PatchMapping("/{reviewId}")
    public ResponseEntity update(
            @RequestHeader("Authorization") String authorizationText,
            @PathVariable long productId,
            @PathVariable long reviewId,
            @RequestBody AddReviewRequest request){

        if (!productManager.isExist(productId)) {
            return ResponseEntity.badRequest().body(null);
        }

        var sessionId = Integer.parseInt(authorizationText);
        var session = sessionManager.get(sessionId);
        if (session == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var user = userManager.get(session.getUserId());
        if (user == null) {
            return ResponseEntity.badRequest().body(null);
        }

        if(!reviewManager.isExist(reviewId)){
            return ResponseEntity.badRequest().body(null);
        }

        var review = reviewManager.get(reviewId);
        review.setContent(request.getContent());
        reviewManager.update(review);
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{reviewId}")
    public ResponseEntity remove(
            @RequestHeader("Authorization") String authorizationText,
            @PathVariable long productId,
            @PathVariable long reviewId){

        if (!productManager.isExist(productId)) {
            return ResponseEntity.badRequest().body(null);
        }

        var sessionId = Integer.parseInt(authorizationText);
        var session = sessionManager.get(sessionId);
        if (session == null) {
            return ResponseEntity.badRequest().body(null);
        }

        var user = userManager.get(session.getUserId());
        if (user == null) {
            return ResponseEntity.badRequest().body(null);
        }

        reviewManager.remove(reviewId);
        return ResponseEntity.ok(null);
    }
}
