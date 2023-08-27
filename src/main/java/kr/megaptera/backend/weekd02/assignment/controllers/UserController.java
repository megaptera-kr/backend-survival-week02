package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    // 회원가입
    @PostMapping
    public String create(@RequestBody String userDTO) {
        return "회원가입\n";
    }

    // 내 정보
    @GetMapping("/me")
    public String detail(@RequestAttribute String userId) {
        return "내 정보" + userId + "\n";
    }

    // 내 정보 수정
    @PatchMapping("/me")
    public String update(
            @RequestAttribute String userId,
            @RequestBody String userDTO
    ) {
        return "내 정보 수정" + userDTO + "\n";
    }
}
