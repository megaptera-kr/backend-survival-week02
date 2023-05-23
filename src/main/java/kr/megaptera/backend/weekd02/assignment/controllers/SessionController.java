package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SessionController {
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.CREATED)
    public String login(@RequestBody String loginDto) {
        return "로그인 : " + loginDto + "\n";
    }

    @DeleteMapping("/logout")
    public String logout(@RequestAttribute String userId) {
        return "로그아웃 : " + userId + "\n";
    }
}
