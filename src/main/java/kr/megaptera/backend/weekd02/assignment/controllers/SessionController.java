package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class SessionController {
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.CREATED)
    private String loginUser(@RequestBody String loginDTO) {
        return "로그인 정보" + "'" + loginDTO + "'" + "로그인 입니다.";
    }

    @PostMapping("/logout")
    @ResponseStatus(HttpStatus.CREATED)
    private String logoutUser(@RequestAttribute String userId) {
        return "'" + userId + "'" + "님 로그아웃 입니다.";
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    private String createUser(@RequestBody String registerDTO) {
        return " 회원가입 입니다. \n" + registerDTO;
    }
}
