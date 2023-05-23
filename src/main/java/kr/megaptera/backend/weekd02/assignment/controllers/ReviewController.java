package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/{products_id}/reviews")
public class ReviewController {
    @PostMapping
    public String create(@PathVariable(value = "products_id") String productsId, @RequestBody String review, String memberId) {
        return "상품에 리뷰 작성";
    }

    @PatchMapping("/reviews_id")
    public String update(@PathVariable (value = "products_id") String productsId,
                         @PathVariable (value = "reviews_id") String reviewsId,
                         @RequestBody String review,
                         String memberId) {
        return "상품에 리뷰 수정";
    }

    @DeleteMapping("/reviews_id")
    public String delete(@PathVariable (value = "products_id") String productsId,
                         @PathVariable (value = "reviews_id") String reviewsId,
                         String memberId) {
        return "상품에 리뷰 삭제";
    }
}
