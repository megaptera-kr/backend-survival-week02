package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {
    @PostMapping
    public String login(@RequestBody(required = false) String loginDTO){
        return "로그인 : ID" + loginDTO +"\n";
    }
    @DeleteMapping
    public String logout(@RequestAttribute String userId){
        return "로그아웃\n";
    }
}
