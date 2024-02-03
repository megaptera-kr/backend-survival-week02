package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {
    @PostMapping("/")
    public String postSession(){
        return "로그인";
    }

    @DeleteMapping("/")
    public String deleteSession(){
        return "로그아웃";
    }
}
