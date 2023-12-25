package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {
    // 로그인
    @PostMapping
    String login() {
        return "로그인";
    }

    // 로그아웃
    @DeleteMapping
    String logout() {
        return "로그아웃";
    }
}
