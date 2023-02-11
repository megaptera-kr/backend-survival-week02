package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUser(@RequestAttribute String userId) {
        return "User: " + userId + " information is loaded";
    }

    @PatchMapping
    public String updateUser(@RequestAttribute String userId, @RequestBody String updatedUserInfo) {
        return "User: " + userId + " information is updated.";
    }

}
