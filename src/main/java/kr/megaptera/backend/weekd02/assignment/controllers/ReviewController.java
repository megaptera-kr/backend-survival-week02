package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private String create(@PathVariable("productId") String productId, @RequestBody String createReviewsDTO, @RequestAttribute String userId) {
        return "상품 리뷰 작성 입니다.\n상품 ID : " + productId + "\n" + "작성자 ID : " + userId + "\n" + createReviewsDTO;
    }

    @PatchMapping("/{reviewsId}")
    private String update(@PathVariable("productId") String productId, @PathVariable("reviewId") String reviewId, @RequestBody String updateReviewsDTO, @RequestAttribute String userId) {
        return "상품 리뷰 수정 입니다.\n상품 ID : " + productId + "\n" + "리뷰 ID : " + reviewId + "\n" + "작성자 ID : " + userId + "\n" + updateReviewsDTO;
    }

    @DeleteMapping("/{reviewsId}")
    private String delete(@PathVariable("productId") String productId, @PathVariable("reviewId") String reviewId, @RequestAttribute String userId) {
        return "상품 리뷰 삭제 입니다.\n상품 ID : " + productId + "\n" + "리뷰 ID : " + reviewId + "\n" + "작성자 ID : " + userId + "\n";
    }
}
