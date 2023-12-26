package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods/{goodsId}/reviews")
public class ReviewController {

    @PostMapping
    public String createReview(
            @PathVariable String goodsId,
            @RequestAttribute String userId,
            @RequestBody String reviewDTO) {
        return "리뷰 생성 : " + goodsId + "\n";
    }

    @PatchMapping("/{reviewId}")
    public String updateReview(
            @PathVariable String goodsId,
            @PathVariable String reviewId,
            @RequestAttribute String userId,
            @RequestBody String reviewDTO) {
        return "리뷰 수정 : " + userId + " / " + reviewId + "\n";
    }

    @DeleteMapping("/{reviewId}")
    public String deleteReview(
            @PathVariable String goodsId,
            @RequestAttribute String userId,
            @PathVariable String reviewId) {
        return "리뷰 삭제 : " + userId + " / " + reviewId + "\n";
    }
}
