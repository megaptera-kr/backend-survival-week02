package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products/{product_id}/reviews")
public class ReviewController {

    @PostMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public String setReview(
            @PathVariable String product_id,
            @PathVariable String id,
            @RequestAttribute String userId,
            @RequestBody String reviewDto
    ) {
        return "리뷰 작성";
    }

    @PutMapping("{id}")
    public String modifyReview(
            @PathVariable String product_id,
            @PathVariable String id,
            @RequestAttribute String userId,
            @RequestBody String reviewDto
    ) {
        return "리뷰 수정";
    }

    @DeleteMapping("{id}")
    public String deleteReview(
            @PathVariable String product_id,
            @PathVariable String id,
            @RequestAttribute String userId
    ) {
        return "리뷰 삭제";
    }
}
