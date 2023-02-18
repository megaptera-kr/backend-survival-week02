package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public String createSession(@RequestAttribute Long userId) {
    return "로그인 성공 : " + userId;
  }

  @DeleteMapping
  public String deleteSession(@RequestAttribute Long userId) {
    return "로그아웃 성공 : " + userId;
  }
}
