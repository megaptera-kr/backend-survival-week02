package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {

    @PostMapping
    public String login(@RequestBody String userDto) {
        return "로그인 사용자 " + userDto + "\n";
    }

    @DeleteMapping
    public String logout(@RequestAttribute String userId) {
        return "로그아웃 사용자 " + userId + "\n";
    }
}
