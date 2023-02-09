package kr.megaptera.backend.weekd02.assignment.controllers;

import org.apache.logging.log4j.util.Strings;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestAttribute String userId, @RequestParam String id, @RequestParam String password) {
        if (Strings.isNotBlank(userId) && userId.equals(id)) {
            return "이미 로그인 된 id입니다.";
        }
        return "로그인 완료: " + id + " / " + password;
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public String logOut(@RequestAttribute String userId){
        return "로그아웃 : " + userId;
    }
}
