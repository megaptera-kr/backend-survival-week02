package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {
    @PostMapping({"", "/"})
    @ResponseStatus(HttpStatus.CREATED)
    public String postReviews(
            @RequestAttribute int userId,
            @PathVariable int productId,
            @RequestBody String ReviewDTO
    ) {
        return "상품에 리뷰 작성\n";
    }

    @PutMapping({"", "/"})
    @ResponseStatus(HttpStatus.OK)
    public String putReviews(
            @RequestAttribute int userId,
            @PathVariable int productId,
            @RequestBody String ReviewDTO
    ) {
        return "상품에 리뷰 수정\n";
    }

    @DeleteMapping({"", "/"})
    @ResponseStatus(HttpStatus.OK)
    public String deleteReviews(
            @RequestAttribute int userId,
            @PathVariable int productId
    ) {
        return "상품에 리뷰 삭제\n";
    }
}
