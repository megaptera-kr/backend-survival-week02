package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class UserController {

    @PostMapping
    public String save(String member) {
        return "회원 가입";
    }

    @PostMapping("/my-page")
    public String showDetails(String member) {
        return "내 정보";
    }

    @PatchMapping("/my-page")
    public String update(String member) {
        return "내 정보 수정";
    }
}
