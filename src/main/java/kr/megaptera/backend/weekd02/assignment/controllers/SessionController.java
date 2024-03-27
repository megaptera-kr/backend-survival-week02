package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.config.message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {
  @PostMapping
  public String login(@RequestBody String loginDTO){
    return message.makeMassage("로그인",loginDTO);
  }
  @DeleteMapping
  public String logout(@RequestAttribute String userId){
    return message.makeMassage("로그아웃",userId);
  }
}
