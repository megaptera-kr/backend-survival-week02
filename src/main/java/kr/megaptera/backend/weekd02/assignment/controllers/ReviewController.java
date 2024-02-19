package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products/{productId}/reviews")
public class ReviewController {
    @GetMapping
    public String list(@PathVariable String productId) {
        return "리뷰 목록: " + productId + "\n";
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@PathVariable String productId, @RequestBody String reviewDto, @RequestAttribute String userId) {
        return "상품에 리뷰 작성: " + reviewDto + "\n";
    }

    @PatchMapping("{id}")
    public String update(@PathVariable String productId,
                         @PathVariable String id,
                         @RequestBody String reviewDto,
                         @RequestAttribute String userId) {
        return "상품에 리뷰 수정: " + reviewDto + "\n";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable String productId,
                         @PathVariable String id,
                         @RequestAttribute String userId) {
        return "상품에 리뷰 삭제: " + id + "\n";
    }
}
