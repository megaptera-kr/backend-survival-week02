package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {

    @GetMapping
    public String list(@PathVariable String productId){
        return "리뷰 목록\n";
    }

    @PostMapping
    public String createReview(
            @PathVariable String productId,
            @RequestAttribute String userId,
            @RequestBody String reviewDTO
    ) {
        return "리뷰 작성 :" + reviewDTO + "\n";
    }

    @PatchMapping("/{reviewId}")
    public String updateReview(
        @PathVariable String productId,
        @PathVariable String reviewId,
        @RequestAttribute String userId,
        @RequestBody String reviewDTO
    ){
        return "리뷰 수정 :" + reviewDTO + "\n";
    }

    @DeleteMapping("/{reviewId}")
    public String deleteReview(
        @PathVariable String productId,
        @PathVariable String reviewId,
        @RequestAttribute String userId
    ){
        return "리뷰삭제\n";
    }
}
