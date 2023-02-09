package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    //회원가입 메서드
    @PostMapping
    public String createUser(@RequestBody String userDto) {
        return "회원가입 되었습니다" + userDto + "\n";
    }

    // 내 정보 조회 메서드
    @GetMapping("/me")
    public String getMyInfo(@RequestAttribute String userId) {
        String myId = "1";
        return "내 정보 조회: " + myId + "\n";
    }

    // 내 정보 업데이트 메서드
    @PatchMapping("/me")
    public String updateMyInfo(@RequestAttribute String userId,
                               @RequestBody String userDto) {
        String myId = "1";
        return "내 정보 업데이트: " + userDto + "\n";
    }
}
