package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody String userCreateDto) {
        return "회원가입: " + userCreateDto + "\n";
    }

    @GetMapping("me")
    public String detail(@RequestAttribute String userId) {
        return "내 정보 조회: " + userId + "\n";
    }

    @PatchMapping("me")
    public String update(@RequestAttribute String userId,
                         @RequestBody String userUpdateDto) {
        return "내 정보 수정: " + userUpdateDto + "\n";
    }
}
