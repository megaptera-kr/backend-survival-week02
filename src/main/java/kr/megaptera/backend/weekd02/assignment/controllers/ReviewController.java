package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @PostMapping("/")
    public String create (
        @RequestAttribute String userId,
        @RequestBody String reviewDTO
    ) {
        return "리뷰 작성" + reviewDTO + "\n";
    }

    @PatchMapping("/{reviewsId}")
    public String update (
            @PathVariable String reviewsId,
            @RequestAttribute String userId,
            @RequestBody String reviewDTO
    ) {
        return "리뷰 수정" + reviewDTO + "\n";
    }

    @DeleteMapping("/{reviewsId}")
    public String update (
            @PathVariable String reviewsId,
            @RequestAttribute String userId
    ) {
        return "리뷰 삭제" + reviewsId + "\n";
    }
}
