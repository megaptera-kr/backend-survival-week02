package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @PathVariable String productId,
            @RequestBody String reviewDto,
            @RequestAttribute String userId
    ) {
        return "{\"action\" : \"리뷰 등록\", \"body\" : \"" + reviewDto.replace("\"", "\\\"") + "\"}";
    }

    @GetMapping
    public String getList(@PathVariable String productId){

        return productId + "상품의 리뷰 목록" + "\n";
    }

    @PatchMapping("/{reviewId}")
    public String update(
            @PathVariable String productId,
            @PathVariable String reviewId,
            @RequestBody String reviewDto,
            @RequestAttribute String userId
    ) {
        return reviewId + "리뷰 수정\n" + body;
    }

    @DeleteMapping("/{reviewId}")
    public String delete(
            @PathVariable String productId,
            @PathVariable String id,
            @RequestAttribute String userId
    ) {
        return "리뷰 삭제\n";
    }

}
