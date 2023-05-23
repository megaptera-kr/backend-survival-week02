package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping
    private String orders(@RequestAttribute String userId) {
        return "주문 목록";
    }

    @PostMapping
    private String createOrder(
        @RequestBody String orderDto,
        @RequestAttribute String userId
    ) {
        return "주문하기" + orderDto + "\n";
    }
}
