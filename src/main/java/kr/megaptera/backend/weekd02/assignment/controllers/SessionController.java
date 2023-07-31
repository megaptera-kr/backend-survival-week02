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
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody String loginDTO
    ) {
        return "{\"action\": \"로그인\", \"body\": \"" + loginDTO.replace("\"", "\\\"") + "\"}";
    }

    @DeleteMapping
    public String delete(@RequestAttribute String userId) {
        return "로그아웃: " + userId;
    }
}
