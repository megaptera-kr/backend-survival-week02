package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {
    @PostMapping("/session")
    private String login(
        @RequestBody String loginDto
    ) {
        return "로그인" + loginDto + "\n";
    }

    @DeleteMapping("/session")
    private String logout(
        @RequestAttribute String userId
    ) {
        return "로그아웃" + userId + "\n";
    }

    @PostMapping("/users")
    private String signUp(
        @RequestBody String userDto
    ) {
        return "회원가입" + userDto + "\n";
    }
}
