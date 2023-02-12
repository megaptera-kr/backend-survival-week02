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
@RequestMapping("/reviews")
public class ReviewController {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestAttribute String product_id,
            @RequestBody String reviewDTO
    ) {

        return "상품에 리뷰 작성"+ reviewDTO + "\n";
    }

    @PatchMapping("/{id}")
    public String update(
            @PathVariable String id,
            @RequestBody String reviewDTO
    ) {
        return "상품에 리뷰 수정 "+ reviewDTO + "\n";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        return "상품에 리뷰 삭제 "+ id + "\n";
    }

}
