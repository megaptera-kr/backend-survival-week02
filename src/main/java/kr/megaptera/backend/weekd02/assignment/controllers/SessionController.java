package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/session")
public class SessionController {

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody String userDTO) {
        return "로그인" + userDTO + "\n";
    }

    @DeleteMapping("/logout")
    public String logout(@RequestBody String userDTO) {
        return "로그아웃 " + userDTO + "\n";
    }

    /* POST를 사용하여 로그아웃을 많이 사용한다.*/
    @PostMapping("/logout")
    public String postLogout(@RequestAttribute String userId) {
        return "로그아웃 " + userId + "\n";
    }
}
