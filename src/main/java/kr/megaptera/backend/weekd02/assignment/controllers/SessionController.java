package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/session")
@RestController
public class SessionController {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String create(@RequestBody String loginDto){
        // Login
        return "로그인 성공 \n" + loginDto;
    }

    @DeleteMapping
    public String delete(@RequestAttribute("id") String userId){
        // Logout
        return "로그아웃";
    }

}
