package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {

    @PostMapping
    public String login(@RequestAttribute String userId) {
        return "User: " + userId + " login success.";
    }

    @DeleteMapping
    public String logout(@RequestAttribute String userId) {
        return "User: " + userId + " logout success.";
    }

}
