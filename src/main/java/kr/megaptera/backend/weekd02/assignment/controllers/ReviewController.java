package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order/{orderId}/review")
public class ReviewController {
    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addReview(@RequestBody String review, @RequestAttribute String userId) {
        return "작성자: " + userId + " 리뷰내용: " + review + "\n";
    }

    @PostMapping("{reviewId}")
    public String updateReview(@PathVariable String reviewId, @RequestBody String review, @RequestAttribute String userId) {
        return "작성자: " + userId + " 수정된 리뷰 번호: " + reviewId + "수정된 리뷰내용: " + review + "\n";
    }

    @DeleteMapping("{reviewId}")
    public String deleteReview(@PathVariable String reviewId, @RequestAttribute String userId) {
        return "Delete 되었습니다." + "삭제된 번호: " + reviewId;
    }
}
