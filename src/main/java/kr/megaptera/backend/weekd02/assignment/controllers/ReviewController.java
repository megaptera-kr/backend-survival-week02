package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private static final List<String> reviewList = new ArrayList<>();
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String createReview(@RequestParam int productId,
                               @RequestParam String review){
        reviewList.add(review);
        return "상품에 리뷰 작성\n상품 idx : " + productId + "\n리뷰 내용 : " + review;
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String modifyReview(@PathVariable int id,
                               @RequestParam String review){
        reviewList.set(id, review);
        return "상품에 리뷰 수정\n리뷰 id : " + id + "\n리뷰 수정 내용 : " + review;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String removeReview(@PathVariable int id){
        String message = "상품에 리뷰 삭제\n삭제된 리뷰 id: " + id + "\n삭제된 리뷰 내용 : " + reviewList.get(id);
        reviewList.remove(id);
        return message;
    }
}
