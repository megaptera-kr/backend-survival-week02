package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @GetMapping("/login")
    public String login(
            @RequestAttribute String userId,
            @RequestAttribute String userPwd
    ) {
        return "로그인\n";
    }

    @DeleteMapping("/logout")
    public String logout(
            @RequestAttribute String userId,
            @RequestAttribute String userPwd
    ) {
        return "로그아웃\n";
    }

    @PatchMapping("/join")
    public String join(
            @RequestAttribute String userId,
            @RequestAttribute String userPwd
    ) {
        return "회원가입\n";
    }

}
