package kr.megaptera.backend.weekd02.assignment.controllers;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {
    @PostMapping
    public String login(@RequestAttribute String userId) {
        return "로그인: " + userId;
    }

    @DeleteMapping
    public String logout(@RequestAttribute String userId) {
        return "로그아웃: " + userId;
    }
=======
public class SessionController {
>>>>>>> 4b8fda0 (백엔드 생존코스 2주차 과제)
}
