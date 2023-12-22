package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods/{id}/reviews")
public class ReviewController {

    @PostMapping
    public String createReview(@PathVariable String id) {
        return "리뷰 생성 : " + id + "\n";
    }

    @PatchMapping("/{reviewId}")
    public String updateReview(@PathVariable String id, @PathVariable String reviewId) {
        return "리뷰 수정 : " + id + " / " + reviewId + "\n";
    }

    @DeleteMapping("/{reviewId}")
    public String deleteReview(@PathVariable String id, @PathVariable String reviewId) {
        return "리뷰 삭제 : " + id + " / " + reviewId + "\n";
    }
}
