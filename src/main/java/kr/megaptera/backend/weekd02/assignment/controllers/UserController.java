package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String list() {
        return "유저 목록\n";
    }

    @GetMapping("/{user_id}")
    public String read(@PathVariable("user_id") String user_id) {

        return "로그인 성공\n";
    }

    // 1. 회원가입 (POST users/{user_id})
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestAttribute String userId
    ) {
        return "로그인 : " + userId + "\n";
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
