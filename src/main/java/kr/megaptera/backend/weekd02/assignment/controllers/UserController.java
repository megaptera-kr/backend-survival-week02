package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.config.message;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

  @GetMapping("/me")
  public String getDetail(@RequestAttribute String userId){
    return message.makeMassage("내 정보 조회", userId);
  }
  @PutMapping("/me")
  public String update(@RequestAttribute String userId){
    return message.makeMassage("내 정보 수정",userId);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public String create(@RequestBody String userCreateDto){
    return message.makeMassage("회원가입",userCreateDto);
  }

}
