package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody String userDto) {
        return "회원가입 " + userDto + "\n";
    }

    @GetMapping("/my-info")
    public String detail(@RequestAttribute String userId) {
        return userId + "의 상세 정보\n";
    }

    @PatchMapping("/my-info")
    public String update(@RequestAttribute String userId) {
        return userId + "의 정보 수정\n";
    }
}
