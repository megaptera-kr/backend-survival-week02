package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/{productsId}/reviews")
public class ReviewController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private String create(@PathVariable("productsId") String productsId, @RequestBody String createReviewsDTO, @RequestAttribute String userId) {
        return "상품 리뷰 작성 입니다.\n상품 ID : " + productsId + "\n" + "작성자 ID : " + userId + "\n" + createReviewsDTO;
    }

    @PatchMapping("/{reviewsId}")
    private String update(@PathVariable("productsId") String productsId, @PathVariable("reviewsId") String reviewsId, @RequestBody String updateReviewsDTO, @RequestAttribute String userId) {
        return "상품 리뷰 수정 입니다.\n상품 ID : " + productsId + "\n" + "리뷰 ID : " + reviewsId + "\n" + "작성자 ID : " + userId + "\n" + updateReviewsDTO;
    }

    @DeleteMapping("/{reviewsId}")
    private String delete(@PathVariable("productsId") String productsId, @PathVariable("reviewsId") String reviewsId, @RequestAttribute String userId) {
        return "상품 리뷰 삭제 입니다.\n상품 ID : " + productsId + "\n" + "리뷰 ID : " + reviewsId + "\n" + "작성자 ID : " + userId + "\n";
    }
}
