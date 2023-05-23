package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products/{pid}/reviews")
public class ReviewController {
    @GetMapping
    public String ReviewList(@PathVariable String pid) {
        return "상품 리뷰 리스트 : " + pid + "\n";
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @PathVariable String pid,
            @RequestBody String review,
            @RequestAttribute String rid
    ) {
        return "상품에 리뷰 작성 : " + review + "\n";
    }

    @PatchMapping("{rid}")
    public String reviewUpdate(
            @PathVariable String rid,
            @PathVariable String pid,
            @RequestBody String review,
            @RequestAttribute String userId
    ) {

        return "상품에 리뷰 수정 : " + review + "\n";
    }

    @DeleteMapping("{rid}")
    public String reviewDelete(
            @PathVariable String rid,
            @PathVariable String pid,
            @RequestAttribute String userId
    ) {

        return "상품에 리뷰 삭제 : " + rid + "\n";
    }
}
