package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value =  "/user")
public class UserController {
    @PostMapping("/{id}")
    public String postUser(@PathVariable String id){
        return "회원가입 : " + id;
    }
    @GetMapping("/{id}")
    public String userInfo(@PathVariable String id){
        return "내 정보 : " + id;
    }

    @PatchMapping("/{id}")
    public String userUpdate(@PathVariable String id){
        return "내 정보 수정 : " + id;
    }
}
