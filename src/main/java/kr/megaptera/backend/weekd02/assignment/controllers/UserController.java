package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{userId}")
    public String getUserInfo(
            @PathVariable String userId,
            @RequestBody String userDto) {
        return "내 정보\n";
    }

    @PatchMapping("/{userId}")
    public String updateUserInfo(
            @PathVariable String userId,
            @RequestBody String userDto
    ) {
        return "내 정보 수정\n";
    }
}
