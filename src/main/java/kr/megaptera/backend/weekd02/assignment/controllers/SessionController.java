package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {
    @GetMapping({"", "/"})
    public String getSession() {
        return "로그인\n";
    }

    @DeleteMapping({"", "/"})
    public String deleteSession(

            @RequestAttribute int userId
    ) {
        return "로그아웃\n";
    }
}
