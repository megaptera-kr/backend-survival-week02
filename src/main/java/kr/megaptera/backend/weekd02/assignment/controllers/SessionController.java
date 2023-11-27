package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("session")
public class SessionController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String login(@RequestBody String loginDto) {
        return "로그인" + loginDto + "\n";
    }

    @DeleteMapping
    public String logout(@RequestAttribute String userId) {
        return "로그아웃" + userId + "\n";
    }
}
