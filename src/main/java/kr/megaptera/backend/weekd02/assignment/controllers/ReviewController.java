package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createReview(@RequestAttribute String userId,
                               @PathVariable Long productId, @RequestBody String contents) {
        return "A Review of Product " + productId + " is created by User " + userId + ".";
    }

    @PatchMapping("/{reviewId}")
    public String updateReview(@RequestAttribute String userId, @PathVariable Long productId,
                               @PathVariable Long reviewId, @RequestBody String contents) {
        return "A Review " + reviewId + " of Product " + productId + " is updated by User " + userId + ".";
    }

    @DeleteMapping("/{reviewId}")
    public String deleteReview(@RequestAttribute String userId, @PathVariable Long productId,
                               @PathVariable Long reviewId) {
        return "A Review " + reviewId + " of Product " + productId + " is deleted by User " + userId + ".";
    }

}
