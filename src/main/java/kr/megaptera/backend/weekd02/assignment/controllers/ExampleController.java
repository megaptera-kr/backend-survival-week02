package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

// 게시글에 포함된 댓글 REST API 예시
@RestController
@RequestMapping("/posts/{postId}/comments")
public class ExampleController {
    @GetMapping
    public String list(@PathVariable String postId) {
        return "댓글 목록\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
        @PathVariable String postId,
        @RequestAttribute String userId,
        @RequestBody String commentDTO
        /*
        DTO
        {
        "text": "댓글 내용",
        "author": "댓글 작성자",
        "createdDate": "댓글 작성일"
        }
        */
    ) {
        return "댓글 작성" + commentDTO + "\n";
    }

    @PatchMapping("/{id}")
    public String update(
        @PathVariable String postId,
        @PathVariable String id,
        @RequestAttribute String userId,
        @RequestBody String commentDTO

    ) {
        return "댓글 수정" + commentDTO + "\n";
    }

    @DeleteMapping("/{id}")
    public String delete(
        @PathVariable String postId,
        @PathVariable String id,
        @RequestAttribute String userId
    ) {
        return "댓글 삭제" + id + "\n";
    }
}
