package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @PathVariable String productId,
            @RequestAttribute String userId,
            @RequestBody(required = false) String reviewDTO
    ) {
        return "리뷰 작성" + reviewDTO + "\n";
    }

    @PatchMapping("/{id}")
    public String update(
            @PathVariable String productId,
            @PathVariable String id,
            @RequestAttribute String userId,
            @RequestBody(required = false) String reviewDTO

    ) {
        return "리뷰 수정" + reviewDTO + "\n";
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable String productId,
            @PathVariable String id,
            @RequestAttribute String userId
    ) {
        return "리뷰 삭제" + id + "\n";
    }
}
