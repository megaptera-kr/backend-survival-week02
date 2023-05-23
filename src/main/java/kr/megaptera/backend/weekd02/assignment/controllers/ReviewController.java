package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods/{good_id}/reviews")
public class ReviewController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@PathVariable String good_id,
                         @RequestBody String body) {

        //create(good_id);

        return good_id + "의 리뷰 추가\n" +
                body + "\n";
    }

    @PatchMapping("/{review_id}")
    public String update(@PathVariable String good_id,
                         @PathVariable String review_id,
                         @RequestBody String body) {
        //update(good_id,review_id);
        return good_id + "의 " + review_id + "리뷰 수정 \n" +
                body + "\n";
    }

    @DeleteMapping("/{review_id}")
    public String delete(@PathVariable String good_id,
                         @PathVariable String review_id) {
        //delete(good_id,review_id);
        return good_id + "의 " + review_id + "리뷰 삭제 \n";

    }

}
