package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String logIn(
            @RequestAttribute String userId
    ){
        return "로그인 사용자 : " + userId;
    }

    @DeleteMapping
    public String logOut(
            @RequestAttribute String userId
    ){
        return "로그아웃 사용자 : " + userId;
    }
}
