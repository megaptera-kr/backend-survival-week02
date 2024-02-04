package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {

    @PostMapping
    public String createSession(@RequestAttribute("userId") String userId) {
        return "User " + userId + " session is created";
    }

    @DeleteMapping
    public String deleteSession(@RequestAttribute("userId") String userId) {
        return "User " + userId + " session is deleted";
    }
}
