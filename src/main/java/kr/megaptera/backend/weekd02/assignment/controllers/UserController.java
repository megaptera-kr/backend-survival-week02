package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestBody String userDTO
    ){
        return "회원가입" + userDTO;
    }

    @GetMapping
    public String detail(
            @RequestAttribute String userId
    ){
        return userId + "의 회원정보";
    }

    @PatchMapping
    public String update(
            @RequestAttribute String userId,
            @RequestBody String userDTO
    ){
        return userId + "의 회원정보 수정\n" + userDTO;
    }
}
