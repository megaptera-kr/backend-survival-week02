package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("session")
public class SessionController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String login(@RequestBody String loginDto) { //로그인 할때는 id, 비번 입력해야하기 때문에 dto로 받음, 무엇인가를 입력받을때 @RequestBody
        return "로그인" + loginDto + "\n";
    }

    @DeleteMapping("{id}")
    public String logout(@RequestAttribute String userId) { //로그아웃 할때는 id로 식별만
        return "로그아웃" + userId + "\n";
    }
}
