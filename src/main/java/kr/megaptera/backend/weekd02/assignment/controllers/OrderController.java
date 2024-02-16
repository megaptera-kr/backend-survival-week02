package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderController {
    @GetMapping
    public String list(@RequestAttribute String userId) {
        return "주문 목록" + userId + "\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestAttribute String userId, @RequestBody String orderDto) {
        return "주문하기" + orderDto + "\n";
    }

}
