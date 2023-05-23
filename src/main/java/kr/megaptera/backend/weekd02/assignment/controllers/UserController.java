package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/profile")
    public String getProfile(
        @RequestAttribute String userId
    ) {
        return "내 정보";
    }

    @PutMapping("/profile")
    public String modifyProfile(
        @RequestAttribute String userId,
        @RequestBody String profileDto
    ) {
        return "내 정보 수정";
    }
}
