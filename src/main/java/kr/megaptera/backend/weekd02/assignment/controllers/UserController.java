package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
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
@RequestMapping("/user")
public class UserController {

    // 회원가입 하기
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(
            @RequestAttribute String userId,
            @RequestBody String userDTO
    ) {
        return userId + "님의 회원 가입을 축하합니다.\n";
    }

    // 자신의 정보 얻기
    @GetMapping("/me")
    public String getMyInfo(@RequestAttribute String userId) {
        return userId + "님의 회원 정보입니다.\n";
    }

    // 자신의 정보 수정하기
    @PatchMapping("/me")
    public String updateMyInfo(
            @RequestAttribute String userId,
            @RequestBody String userDTO
    ) {
        return userId + "님의 정보를 요청 내용으로 수정합니다.\n\n"
                + userDTO;
    }

    // Exception handling (POST, PATCH 시 body가 없는 경우 대응)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String badRequest() {
        return "해당 요청 시에는 요청 내용 전송이 필요합니다.\n";
    }

}
