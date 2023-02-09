package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {
    @PostMapping
    public String login(@RequestBody String id) {
        return "로그인 했습니다.\n";
    }

    @DeleteMapping
    public String logout(@RequestBody String sessionKey) {
        return "로그아웃 했습니다\n";
    }
}
