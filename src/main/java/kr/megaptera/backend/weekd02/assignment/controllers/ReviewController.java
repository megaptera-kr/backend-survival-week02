package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {
    @PostMapping()
    private String createReview(@PathVariable Long productId) {
        return "상품 리뷰 작성";
    }

    @DeleteMapping("/{reviewId}")
    private String deleteReview(
        @PathVariable Long productId,
        @PathVariable Long reviewId
    ) {
        return "상품 리뷰 삭제" + reviewId + "\n";
    }

    @PatchMapping("/{reviewId}")
    private String updateReview(
        @PathVariable Long productId,
        @PathVariable Long reviewId,
        @RequestBody String reviewDto
    ) {
        return "상품 리뷰 수정" + reviewDto + "\n";
    }
}
