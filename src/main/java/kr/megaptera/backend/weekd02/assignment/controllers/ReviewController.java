package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {

    @PostMapping()
    public String create(
            @PathVariable String productId,
            @RequestBody String reviewDto,
            @RequestAttribute String userId
    ) {
        return "상품에 리뷰 작성: " + reviewDto + "\n";
    }

    @PatchMapping("/{id}")
    public String update(
            @PathVariable String productId,
            @PathVariable String id,
            @RequestBody String reviewDto,
            @RequestAttribute String userId
    ) {
        return "상품에 리뷰 수정: " + reviewDto + "\n";
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable String productId,
            @PathVariable String id,
            @RequestAttribute String userId
    ) {
        return "상품에 리뷰 삭제: " + id + "\n";
    }
}
