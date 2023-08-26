package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {

    //상품에 리뷰 작성
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createReview(
            @RequestBody String reviewForm,
            @PathVariable("productId") String productId,
            @RequestAttribute("userId") String userId) {
        return productId + " 상품의 리뷰 작성: " + userId + "\n" + reviewForm + "\n";
    }

    //상품에 리뷰 수정
    @PatchMapping("{id}")
    public String updateReview(
            @RequestBody String reviewForm,
            @PathVariable("productId") String productId,
            @RequestAttribute("userId") String userId,
            @PathVariable("reviewId") String reviewId) {
        return productId + " 상품에 리뷰 수정: " + userId + "\n"
                + "제품 번호: " + reviewId + " " + reviewForm + "\n";
    }

    //상품에 리뷰 삭제
    @DeleteMapping("{id}")
    public String updateReview(
            @PathVariable("productId") String productId,
            @RequestAttribute("userId") String userId,
            @PathVariable("reviewId") String reviewId) {
        return productId + " 상품에 리뷰 삭제: " + userId + "\n"
                + "제품 번호: " + reviewId + "\n";
    }
}
