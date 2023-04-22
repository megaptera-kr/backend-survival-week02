package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {

    @GetMapping("/")
    public String login(
        @RequestBody String userId,
        @RequestBody String userPassword
    ) {
        return "로그인";
    }

    @DeleteMapping("/")
    public String logout(
        @RequestAttribute String userId
    ) {
        return "로그아웃";
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public String signUp(
        @RequestBody String userId,
        @RequestBody String userPassword
    ) {
        return "회원가입";
    }
}
