package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/products/{productId}/reviews")
public class ReviewController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createReview(@PathVariable String productId,
                               @RequestBody String reviewDTO,
                               @RequestAttribute String userId) {
        return productId + "상품에 리뷰 작성하셨습니다." + reviewDTO + "\n";
    }

    @PatchMapping("/{reviewId}")
    @ResponseStatus(HttpStatus.OK)
    public String modifyReview(@PathVariable String productId,
                               @PathVariable String reviewId,
                               @RequestBody String reviewDTO,
                               @RequestAttribute String userId) {
        return productId + "상품에 리뷰를 수정하셨습니다." + reviewDTO + "\n";
    }

    @DeleteMapping("/{reviewId}")
    @ResponseStatus(HttpStatus.OK)
    public String removeReview(@PathVariable String productId,
                               @PathVariable String reviewId,
                               @RequestAttribute String userId) {
        return productId + "상품에 리뷰를 삭제하셨습니다.\n";
    }
}
