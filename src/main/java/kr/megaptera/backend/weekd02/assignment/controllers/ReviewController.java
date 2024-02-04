package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @GetMapping("/{productId}")
    public String getReviews(@PathVariable String productId) {
        return "Reviews of product " + productId + " are returned";
    }

    @PatchMapping("/{productId}/{reviewId}")
    public String updateReview(@PathVariable String productId, @PathVariable String reviewId) {
        return "Review " + reviewId + " of product " + productId + " is updated";
    }

    @DeleteMapping("/{productId}/{reviewId}")
    public String deleteReview(@PathVariable String productId, @PathVariable String reviewId) {
        return "Review " + reviewId + " of product " + productId + " is deleted";
    }
}
