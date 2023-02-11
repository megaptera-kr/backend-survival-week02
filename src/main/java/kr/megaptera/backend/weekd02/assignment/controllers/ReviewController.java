package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("items/{items_id}/comments")
public class ReviewController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @PathVariable String items_id,
            @RequestBody String commentDTO
    ){
        return items_id + "의 다음과 같은 댓글을 작성\n" + commentDTO;
    }

    @PatchMapping("/{comments_id}")
    public String update(
            @PathVariable String items_id,
            @PathVariable String comments_id,
            @RequestBody String commentDTO
    ){
        return items_id + "/" + comments_id + "의 댓글 내용을 다음과 같이 수정\n" + commentDTO;
    }

    @DeleteMapping("/{comments_id}")
    public String delete(
            @PathVariable String items_id,
            @PathVariable String comments_id
    ){
        return items_id + "/" + comments_id + "의 댓글을 삭제";
    }
}
