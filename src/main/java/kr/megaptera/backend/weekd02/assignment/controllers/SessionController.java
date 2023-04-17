package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {
    @PostMapping
    public String login() {
        return "로그인";
    }

    @DeleteMapping
    public String logout(@RequestAttribute String userId) {
        return userId + "회원 로그아웃";
    }
}
