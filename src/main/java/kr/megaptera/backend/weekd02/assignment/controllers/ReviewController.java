package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @PathVariable String productId,
            @RequestAttribute String userId,
            @RequestBody String reviewDTO){
        return "리뷰 작성" + reviewDTO + "\n";
    }

    @PatchMapping("/{id}")
    public String update(
            @PathVariable String productId,
            @PathVariable String id,
            @RequestAttribute String userId,
            @RequestBody String reviewDTO){
        return "리뷰 수정" + reviewDTO + "\n";
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable String productId,
            @PathVariable String id,
            @RequestAttribute String userId
    ){
        return "리뷰 삭제" + id + "\n";
    }
}
