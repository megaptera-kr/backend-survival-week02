package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {

    // 로그인하기 (세션 만들기)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String login(
            @RequestAttribute("userId") String userId,
            @RequestBody String loginDTO) {

        // userDTO로 들어온 userId와 password가 일치하면 로그인 성공

        return userId + "번 고객님께서 로그인하셨습니다.\n";
    }

    // 로그아웃하기 (세션 파기하기)
    @DeleteMapping
    public String logout(
            @RequestAttribute("userId") String userId
    ) {
        return userId + "번 고객님께서 성공적으로 로그아웃하셨습니다.\n";
    }
}
