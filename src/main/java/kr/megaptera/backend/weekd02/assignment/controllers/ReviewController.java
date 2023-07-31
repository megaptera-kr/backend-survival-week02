package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ReviewController {
    // 상품에 리뷰 작성
    @PostMapping("/products/{productId}/reviews")
    @ResponseStatus(HttpStatus.CREATED)
    public String write(
            @PathVariable String productId,
            @RequestAttribute String userId
    ) {
        return "상품에 리뷰 작성: " + userId + ":" + productId;
    }

    // 상품에 리뷰 수정
    @PatchMapping("/products/{productId}/reviews/{reviewId}")
    public String modify(
            @PathVariable String productId,
            @PathVariable String reviewId,
            @RequestAttribute String userId
    ) {
        return "상품에 리뷰 수정: " + userId + ":" + productId + ":" + reviewId;
    }

    // 상품에 리뷰 삭제
    @DeleteMapping("/products/{productId}/reviews/{reviewId}")
    public String delete(
            @PathVariable String productId,
            @PathVariable String reviewId,
            @RequestAttribute String userId
    ) {
        return "상품에 리뷰 삭제: " + userId + ":" + productId + ":" + reviewId;
    }
}
