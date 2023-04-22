package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestAttribute String userId,
            @RequestBody String orderDTO
    ) {
        return "주문하기 : " + orderDTO + "\n";
    }

    @GetMapping("/")
    public String list(@RequestAttribute String userId) {
        return "주문 목록\n";
    }
}
