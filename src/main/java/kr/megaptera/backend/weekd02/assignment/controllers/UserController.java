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
    // 1. 정보 조회 (GET localhost:8080/users/me)
    @GetMapping("me")
    public String read(@RequestAttribute String id) {

        return id + "님의 정보\n";
    }

    // 2. 회원 가입 (POST localhost:8080/users id = "" age ="")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
        public String create(
                @RequestBody String body
    ) {
            return "{\"action\" : \"회원가입\", \"body\" : \"" + body.replace("\"", "\\\"") + "\"}";
    }

    // 3. 내 정보 수정 (PATCH localhost:8080/users/me age="")
    @PatchMapping("/me")
    public String update(
            @RequestAttribute String id,
            @RequestBody String body
    ) {
        return id + "님의 정보 수정\n";
    }

}
