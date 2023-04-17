package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    public String join() {
        return "회원 가입";
    }

    @GetMapping("/me")
    public String mypage() {
        return "내 정보";
    }

    @PatchMapping("/me")
    public String updateMypage() {
        return "내 정보 수정";
    }
}
