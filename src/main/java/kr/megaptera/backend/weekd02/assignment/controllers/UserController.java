package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String singUp(@RequestBody String userInfo) {
        return userInfo + "님 회원가입 하셨습니다.\n";
    }

    @GetMapping("/userinfo")
    public String getUserInfo(@RequestAttribute String userId) {
        return userId + "번님의 " + "상세정보\n";
    }

    @PatchMapping("/userinfo")
    public String userInfoUpdate(@RequestBody String userInfo, @RequestAttribute String userId) {
        return userId + "번 님 수정 되었습니다." + userInfo + "\n";
    }
}