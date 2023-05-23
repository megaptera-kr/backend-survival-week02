package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class SessionController {
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public String sessionCreate(@RequestBody String body,
                                @RequestAttribute String userId) {
        return "logIn 되셨습니다. \n" +
                "환영합니다. " + body + "\n";
    }

    @DeleteMapping("/")
    public String sessionDestroy() {
        return "logOut 되었습니다. \n" +
                "안녕히 가십시오. \n";
    }
}
