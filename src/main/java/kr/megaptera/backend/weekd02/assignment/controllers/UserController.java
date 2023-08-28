package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    //회원가입
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(@RequestBody String userForm, @RequestAttribute String userId)
    {
        return "회원가입: " + userId + "\n" +  userForm + "\n";
    }

    //내 정보 수정
    @PatchMapping("/me")
    public String updateMyInfo(@RequestBody String userForm, @RequestAttribute String userId)
    {
        return "내 정보 수정: " + userId + "\n" +  userForm + "\n";
    }

    //내 정보 조회
    @GetMapping("/me")
    public String getMyInfo(@RequestAttribute String userId)
    {
        return "내 정보 조회: " + userId + "\n";
    }

}
