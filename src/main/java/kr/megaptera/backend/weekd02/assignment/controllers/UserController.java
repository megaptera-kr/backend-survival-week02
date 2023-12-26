package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/me")
    public String detail(@RequestAttribute String userId){
        return "내 정보조회" + userId + "\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody String userCreateDTO){
        return "회원가입: " + userCreateDTO + "\n";
    }

    @PatchMapping("/me")
    public String update(@RequestBody String userUpdateDto, @RequestAttribute String userId){
        return "내 정보 수정" + userUpdateDto + "\n";
    }
}
