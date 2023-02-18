package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.util.SessionUtil;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {
  @PostMapping
  public String login(@RequestAttribute(SessionUtil.USER_ID_ATTRIBUTE) String userId) {
    return String.format("유저 번호 %s번 유저가 로그인하였습니다.", userId);
  }

  @DeleteMapping
  public String logout(@RequestAttribute(SessionUtil.USER_ID_ATTRIBUTE) String userId) {
    return String.format("유저 번호 %s번 유저가 로그아웃 하였습니다.", userId);
  }

}
