package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.config.message;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public String create(@RequestAttribute String userId){
    return message.makeMassage("주문하기",userId);
  }

  @GetMapping
  public String list(@RequestAttribute String userId){
    return message.makeMassage("주문 목록",userId);
  }
}
