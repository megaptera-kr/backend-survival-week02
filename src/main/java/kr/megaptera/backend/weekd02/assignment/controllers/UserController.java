package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    String join() {
        return "회원 가입";
    }

    // 내 정보
    @GetMapping("/me")
    String getMe(
            @RequestAttribute String userId
    ) {
        return "내 정보 : " + userId;
    }

    @PatchMapping("/me")
    String updateMe(
            @RequestAttribute String userId
    ) {
        return "내 정보 수정 : " + userId;
    }
}
