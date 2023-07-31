package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart/orders")
public class OrderController {
    // 주문하기
    @PostMapping
    public String order(@RequestAttribute String userId) {
        return "주문하기: " + userId;
    }

    // 주문목록
    @GetMapping
    public String list(@RequestAttribute String userId) {
        return "주문목록: " + userId;
    }
}
