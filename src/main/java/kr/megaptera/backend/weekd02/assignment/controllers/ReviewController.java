package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class ReviewController {

    @PostMapping("/products/{products_id}/reviews")
    public String createReviews(@PathVariable String products_id) {
        return products_id + "번 상품의 리뷰 작성";
    }

    @PatchMapping("/products/{products_id}/reviews/{review_id}")
    public String updateReviews(@PathVariable String products_id, @PathVariable String review_id) {
        return products_id + "번 상품의" + review_id + "번 리뷰 수정";
    }

    @DeleteMapping("/products/{products_id}/reviews/{review_id")
    public String deleteReviews(@PathVariable String products_id, @PathVariable String review_id) {
        return products_id + "번 상품의" + review_id + "번 리뷰 삭제";
    }

}
