package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/{product_id}/reviews")
public class ReviewController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String writeReview(
            @PathVariable("product_id") String productId,
            @RequestBody String reviewDTO
    ) {
        return "{\"action\": \"리뷰 작성: " + productId + "번 상품" + "\", \"body\": \"" + reviewDTO.replace("\"", "\\\"") + "\"}";
    }

    @PatchMapping("/{id}")
    public String editReview(
            @PathVariable("product_id") String productId,
            @PathVariable("id") String id,
            @RequestBody String reviewDTO
    ) {
        return "{\"action\": \"리뷰 수정: " + productId + "번 상품 " + id + "번" + "\", \"body\": \"" + reviewDTO.replace("\"", "\\\"") + "\"}";
    }

    @DeleteMapping("/{id}")
    public String deleteReview(
            @PathVariable("product_id") String productId,
            @PathVariable("id") String id
    ) {
        return "리뷰 삭제: " + productId + "번 상품 " + id + "번";
    }
}
