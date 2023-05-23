package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {

    @PostMapping("/login")
    public String login (@RequestBody String loginDto) {
        return "로그인 성공\n";
    }

    @PostMapping("/logout")
    public String logout () {
        return "로그아웃 성공\n";
    }

    @PostMapping("/signup")
    public String signup(@RequestBody String signupDto) {
        return "회원가입 성공\n";
    }
}
