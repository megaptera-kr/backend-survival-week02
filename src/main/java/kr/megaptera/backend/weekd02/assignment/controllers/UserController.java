package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController("users")
public class UserController {
    @PostMapping("/join")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody String user) {
        return "회원가입 : " + user + "\n";
    }

    @GetMapping("my")
    public String getUser(@RequestAttribute String id) {
        return "내 정보 조회 : " + id + "\n";
    }

    @PatchMapping("my")
    public String update(
            @RequestAttribute String id,
            @RequestBody String user
    ) {
        return "내 정보 수정 : " + user + "/ 아이디 : " + id + "\n";
    }
}
