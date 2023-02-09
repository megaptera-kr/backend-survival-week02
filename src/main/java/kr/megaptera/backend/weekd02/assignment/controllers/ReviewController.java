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

    // 상품에 대한 리뷰 작성 메서드
    @PostMapping
    public String postProductReview(@PathVariable String productId,
                                    @RequestBody String reviewDto
    ) {
        return "상품 %s에 대한 리뷰 작성\n등록 리뷰: %s"
                .formatted(productId, reviewDto);
    }

    // 상품에 대한 리뷰 수정 메서드
    @PatchMapping("/{reviewId}")
    public String updateProductReview(@PathVariable String productId,
                                      @PathVariable String reviewId,
                                      @RequestBody String reviewDto
    ) {
        return "상품 %s에 대한 리뷰Id %s 수정\n새로운 리뷰: %s"
                .formatted(productId, reviewId, reviewDto);
    }

    // 상품에 대한 리뷰 삭제 메서드
    @DeleteMapping("/{reviewId}")
    public String deleteProductReview(@PathVariable String productId,
                                      @PathVariable String reviewId
    ) {
        return "상품 %s에 대한 리뷰Id %s 삭제".formatted(productId, reviewId);
    }
}
