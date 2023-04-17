package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String signup(@RequestBody(required = false) String userDTO){
        return "회원 가입 완료\n";
    }

    @GetMapping("/me")
    public String view_me(@RequestAttribute String userId){
        return "내 정보 조회 : "+userId+"\n";
    }

    @PutMapping("/me")
    public String update_me(@RequestAttribute String userId){
        return "내 정보 수정완료\n";
    }
}
