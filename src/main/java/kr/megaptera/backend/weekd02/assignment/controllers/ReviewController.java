package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    // 상품에 리뷰 작성
    @PostMapping
    String createReview(@RequestBody String item_id) {
        // TODO : body cleaning
        return "상품에 리뷰 작성 : " + item_id;
    }

    // 상품에 리뷰 수정
    @PatchMapping("/{id}")
    String updateReview(@PathVariable String id) {
        return "상품에 리뷰 수정 : " + id;
    }

    // 상품에 리뷰 삭제
    @DeleteMapping("/{id}")
    String deleteReview(@PathVariable String id) {
        return "상품에 리뷰 삭제 : " + id;
    }
}
