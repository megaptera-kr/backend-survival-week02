package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping({"", "/"})
    @ResponseStatus(HttpStatus.CREATED)
    public String postUsers(
            @RequestBody String UserDto
    ) {
        return "회원가입\n";
    }

    @GetMapping({"/me", "/me/"})
    @ResponseStatus(HttpStatus.OK)
    public String getMe(
            @RequestAttribute int userId
    ) {
        return "내 정보\n";
    }

    @PutMapping({"/me", "/me/"})
    @ResponseStatus(HttpStatus.OK)
    public String putMe(
            @RequestAttribute int userId
    ) {
        return "내 정보 수정\n";
    }
}
