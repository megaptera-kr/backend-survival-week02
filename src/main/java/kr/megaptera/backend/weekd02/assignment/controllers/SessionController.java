package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/yhjs1211")

public class SessionController {
    @PostMapping("/session")
    @ResponseStatus(HttpStatus.CREATED)
    public String login() {
        String msg = "로그인 되었습니다.\n";
        return msg;
    }

    @DeleteMapping("/session")
    @ResponseStatus(HttpStatus.OK)
    public String logout() {

        String msg = "로그아웃 되었습니다.\n";
        return msg;
    }


}
