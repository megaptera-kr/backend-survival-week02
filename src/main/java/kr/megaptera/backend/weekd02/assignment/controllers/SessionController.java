package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

public class SessionController {

    @PostMapping("/session")
    public String login (@RequestBody String loginDTO) {
        return loginDTO + "정보로 로그인 성공";
    }

    @PostMapping("/session")
    public String logout (@RequestAttribute String cookie) {
        return  cookie + "정보에 있는 유저 로그아웃 성공";
    }

    @PostMapping("/signup")
    public String signup(@RequestBody String userDTO) {
        return userDTO + " 정보로 회원가입 성공";
    }
}
