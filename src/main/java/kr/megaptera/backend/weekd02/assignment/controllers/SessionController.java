package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class SessionController {

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody String loginForm){
        return "로그인";
    }

    @PostMapping("/logout")
    @ResponseStatus(HttpStatus.OK)
    public String logout(@RequestBody String logoutForm){
        return "로그아웃";
    }


}
