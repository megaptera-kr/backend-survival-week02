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
@RequestMapping("/comments")
public class ReviewController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestAttribute String userId,
            @RequestBody String commentDTO
    ) {
        return "상품리뷰작성" + commentDTO + "\n";
    }

    @PatchMapping("/{comments_id}")
    public String update(
            @PathVariable String comments_id,
            @RequestAttribute String userId,
            @RequestBody String commentDTO

    ) {
        return "상품리뷰수정(" + comments_id + ") : " + commentDTO + "\n";
    }

    @DeleteMapping("/{comments_id}")
    public String delete(
            @PathVariable String comments_id,
            @RequestAttribute String userId
    ) {
        return "상품리뷰삭제" + comments_id + "\n";
    }
}
