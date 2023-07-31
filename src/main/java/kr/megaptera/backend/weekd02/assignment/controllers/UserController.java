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
@RequestMapping("/users")
public class UserController {
    @GetMapping("/me")
    public String myInfo(
            @RequestAttribute String userId
    ) {
        return "내 정보 조회: " + userId + "\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createId(
            @RequestBody String userDTO
    ) {
        return "{\"action\": \"회원가입\", \"body\": \"" + userDTO.replace("\"", "\\\"") + "\"}";
    }


    @PatchMapping("/me")
    public String updateMyInfo(
            @RequestBody String userDTO
    ) {
        return "{\"action\": \"내 정보 수정\", \"body\": \"" + userDTO.replace("\"", "\\\"") + "\"}";
    }
}
