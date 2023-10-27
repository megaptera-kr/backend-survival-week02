package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping()
    public String getProducts() {
        return "products";
    }

    @GetMapping("/{productId}")
    public String getProduct(@PathVariable String productId) {
        return "product";
    }

    @GetMapping("/{productId}/reviews")
    public String getProductReviews(@PathVariable String productId) {
        return "reviews";
    }

    @PostMapping("/{productId}/reviews")
    public String createProductReview(@PathVariable String productId) {
        return "review";
    }

    @DeleteMapping("/{productId}/reviews/{reviewId}")
    public String deleteProductReview(@PathVariable String productId, @PathVariable String reviewId) {
        return "review";
    }

    @PatchMapping("/{productId}/reviews/{reviewId}")
    public String updateProductReview(@PathVariable String reviewId, @PathVariable String productId) {
        return "review";
    }
}
