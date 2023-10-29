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
        return "상품 목록";
    }

    @GetMapping("/{productId}")
    public String getProduct(@PathVariable String productId) {
        return "상품id :" + productId + " 상세";
    }

    @GetMapping("/{productId}/reviews")
    public String getProductReviews(@PathVariable String productId) {
        return productId + " 상품 리뷰목록";
    }

    @PostMapping("/{productId}/reviews")
    public String createProductReview(@PathVariable String productId) {
        return productId + "상품 리뷰 작성완료";
    }

    @DeleteMapping("/{productId}/reviews/{reviewId}")
    public String deleteProductReview(@PathVariable String productId, @PathVariable String reviewId) {
        return productId + "상품 " + reviewId + "리뷰 삭제";
    }

    @PatchMapping("/{productId}/reviews/{reviewId}")
    public String updateProductReview(@PathVariable String reviewId, @PathVariable String productId) {
        return productId + "상품 " + reviewId + "리뷰 수정";
    }
}
