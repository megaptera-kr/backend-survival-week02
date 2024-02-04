package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody String userInfo) {
        return "User is created, UserInfo: " + userInfo;
    }

    @GetMapping("/me")
    public String getUserInfo(@RequestAttribute("userId") String userId) {
        return "I am user " + userId;
    }

    @PatchMapping("/me")
    public String updateUserInfo(@RequestAttribute("userId") String userId, @RequestBody String userInfo) {
        return "User " + userId + " is updated";
    }
}
