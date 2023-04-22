package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/me")
public class UserController {
    @GetMapping
    private String me(
        @RequestAttribute String userId
    ) {
        return "내 정보 조회 : " + userId + "\n";
    }

    @PatchMapping
    private String updateUser(
        @RequestAttribute String userId,
        @RequestBody String userDto
    ) {
        return "내 정보 수정" + userDto + "\n";
    }
}
