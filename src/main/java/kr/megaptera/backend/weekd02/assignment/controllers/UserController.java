package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String list(@RequestAttribute String userId) {
        //select(userId);
        return userId + "의 유저정보\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(@RequestBody String body) {
        return "계정이 생성되었습니다. " + body;
    }

    @PutMapping
    public String update(@RequestBody String body,
                         @RequestAttribute String userId) {

        return userId + "의 정보 수정 \n" +
                body + "\n";
    }
}
