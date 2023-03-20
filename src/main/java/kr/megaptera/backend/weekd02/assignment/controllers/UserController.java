package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(@RequestBody String userDTO) {
        return "회원가입 완료 :" + userDTO + "\n";
    }

    @GetMapping("/myinfo")
    @ResponseStatus(HttpStatus.OK)
    public String getUser(@RequestAttribute Long userId) {
        return "내정보 조회 :" + userId + "\n";
    }

    @PatchMapping("/myinfo")
    @ResponseStatus(HttpStatus.OK)
    public String updateUser(@RequestBody String userDTO, @RequestAttribute Long userId) {
        return "내정보 수정 :" + userDTO + "\n";
    }

}