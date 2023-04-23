package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping
    public String create(String member, @RequestBody String orderForm) {
        return "주문하기";
    }

    @GetMapping
    public String list() {
        return "주문 목록";
    }



}
