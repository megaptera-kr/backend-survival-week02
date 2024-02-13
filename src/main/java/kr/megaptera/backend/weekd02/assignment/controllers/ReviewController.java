package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product/{productId}/review")
public class ReviewController {

    @PostMapping("/{reviewSeq}")
    public String postReview(@PathVariable String productId, @PathVariable String reviewSeq){
        return productId + " 상품에 리뷰 작성 : " + reviewSeq;
    }

    @PatchMapping("/{reviewSeq}")
    public String patchReview(@PathVariable String productId, @PathVariable String reviewSeq){
        return productId + " 상품에 리뷰 수정 : " + reviewSeq;
    }

    @DeleteMapping("/{reviewSeq}")
    public String deleteReview(@PathVariable String productId, @PathVariable String reviewSeq){
        return productId + " 상품에 리뷰 삭제 : " + reviewSeq;
    }
}
