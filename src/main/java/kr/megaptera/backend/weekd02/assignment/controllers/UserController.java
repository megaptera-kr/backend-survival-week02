package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody String userInfoDTO) {

        return "회원가입"+ userInfoDTO + "\n";
    }

    @GetMapping("/me")
    public String myInfo() {

        return "내 정보";
    }

    @PatchMapping("/me")
    public String myInfoUpdate(@RequestBody String userInfoDTO) {
        return "내정보 수정";
    }

}
