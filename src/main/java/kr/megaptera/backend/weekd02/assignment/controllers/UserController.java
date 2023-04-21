package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/me")
    private String getUserInfo(@RequestAttribute String userId) {
        return "내 정보 가져오기 입니다 : " + "'" + userId + "'";
    }

    @PatchMapping("/me")
    private String updateUserInfo(@RequestAttribute String userId, @RequestBody String userUpdateDTO) {
        return "내 정보 수정하기 입니다 : " + "'" + userId + "'" + "\n" + userUpdateDTO;
    }
}
