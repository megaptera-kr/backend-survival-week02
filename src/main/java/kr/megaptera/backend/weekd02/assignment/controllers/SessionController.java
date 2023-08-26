package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/session")
public class SessionController {

    //로그인
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String login(@RequestBody String loginForm, @RequestAttribute String userId)
    {
        return "로그인: " + userId + "\n" +  loginForm + "\n";
    }

    //로그아웃
    @DeleteMapping
    public String logout(@RequestAttribute String userId)
    {
        return "로그아웃: " + userId + "\n";
    }
}
