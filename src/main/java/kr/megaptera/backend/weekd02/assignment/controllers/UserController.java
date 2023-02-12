package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String signUpUser(@RequestBody String userInfo) {
        return "User: " + userInfo + " signup success.";
    }

    @GetMapping("/me")
    public String getUser(@RequestAttribute String userId) {
        return "User: " + userId + " information is loaded.";
    }

    @PatchMapping("/me")
    public String updateUser(@RequestAttribute String userId, @RequestBody String userInfo) {
        return "User: " + userId + " information is updated.";
    }

}
