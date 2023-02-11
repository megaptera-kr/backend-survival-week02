package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SessionController {

    @PostMapping("/login")
    public String login(@RequestAttribute String userId) {
        return "User: " + userId + " login success.";
    }

    @PostMapping("/logout")
    public String logout(@RequestAttribute String userId) {
        return "User: " + userId + " logout success.";
    }

    @PostMapping("/sign-up")
    @ResponseStatus(HttpStatus.CREATED)
    public String signUpSubmit(@RequestAttribute String userId) {
        return "User: " + userId + " signup success.";
    }

}
