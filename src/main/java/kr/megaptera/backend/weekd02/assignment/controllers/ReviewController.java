package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products/reviews")
public class ReviewController {
    @GetMapping("{productId}")
    public String list(@PathVariable String productId) {
        return "리뷰 목록: " + productId + "\n";
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @PathVariable String productId,
            @RequestBody String content,
            @RequestAttribute String userId
    ) {
        return "리뷰 생성: " + productId + "\n" + content + "\n" + userId + "\n";
    }

    @PutMapping("{reviewId}")
    public String update(
            @PathVariable String reviewId,
            @RequestBody String content
    ) {
        return "리뷰 수정: " + reviewId + "\n" + content + "\n";
    }

    @DeleteMapping("{reviewId}")
    public String delete(
            @PathVariable String reviewId
    ) {
        return "리뷰 삭제: " + reviewId + "\n";
    }
}
