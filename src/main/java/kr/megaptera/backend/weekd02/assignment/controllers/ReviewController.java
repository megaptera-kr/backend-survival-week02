package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

// 상품 하나엔 리뷰를 한번씩만 작성할 수 있다고 가정함
@RestController
@RequestMapping("products/{productId}/review")
public class ReviewController {
    // 상품에 리뷰 작성
    @PostMapping
    public String createReview(
            @RequestAttribute("userId") String userId,
            @PathVariable("productId") String productId,
            @RequestBody String reviewDTO
    ) {
        return userId + "님의 " + productId + " 상품에 대한 리뷰가 등록되었습니다.\n\n"
                + reviewDTO + "\n";
    }

    // 상품에 리뷰 수정
    @PatchMapping("/{reviewId}")
    public String updateReview(
            @RequestAttribute("userId") String userId,
            @PathVariable("productId") String productId,
            @PathVariable("reviewId") String reviewId,
            @RequestBody String reviewDTO
    ) {
        return userId + "님의 " + productId + " 상품에 대한 리뷰(리뷰 번호 : " + reviewId + ")가 수정되었습니다.\n\n"
                + reviewDTO + "\n";
    }

    // 상품에 리뷰 삭제
    @DeleteMapping("/{reviewId}")
    public String deleteReview(
            @RequestAttribute("userId") String userId,
            @PathVariable("productId") String productId,
            @PathVariable("reviewId") String reviewId
    ) {
        return userId + "님의 " + productId + " 상품에 대한 리뷰(리뷰 번호 : " + reviewId + ")가 삭제되었습니다.\n";
    }

    // Exception handling (POST, PATCH 시 body가 없는 경우 대응)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String badRequest() {
        return "해당 요청 시에는 요청 내용 전송이 필요합니다.\n";
    }
}
