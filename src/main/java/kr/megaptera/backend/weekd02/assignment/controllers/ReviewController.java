package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products/{id}/comment")
public class ReviewController {
    @GetMapping
    public String list(@PathVariable String id) {
        return "리뷰 목록: " + id + "\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @PathVariable String id,
            @RequestBody String reviewDto,
            @RequestAttribute String userId
    ) {
        return "상품에 리뷰 작성: " + reviewDto + "\n";
    }

    @PatchMapping("{commentId}")
    public String update(
            @PathVariable String id,
            @PathVariable String commentId,
            @RequestBody String reviewDto,
            @RequestAttribute String userId
    ) {

        return "상품에 리뷰 수정: " + reviewDto + "\n";
    }

    @DeleteMapping("{commentId}")
    public String delete(
            @PathVariable String id,
            @PathVariable String commentId,
            @RequestAttribute String userId
    ) {

        return "상품에 리뷰 삭제: " + id + "\n";
    }
}
