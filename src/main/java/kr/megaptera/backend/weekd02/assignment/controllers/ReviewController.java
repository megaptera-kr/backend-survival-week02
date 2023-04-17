package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {

    @PostMapping
    public String writeReview(@PathVariable String productId) {
        return "상품(id = " + productId + ") 에 대한 리뷰 작성";
    }

    @PutMapping("/{reviewId}")
    public String modifyReview(
            @PathVariable String productId,
            @PathVariable String reviewId) {
        return "상품(id = " + productId + ") 에 대한 리뷰(id = " + reviewId + ") 수정";
    }


}
