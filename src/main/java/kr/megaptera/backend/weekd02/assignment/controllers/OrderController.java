package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    // 주문하기
    @PostMapping("/orders")
    String createOrder() {
        return "주문하기";
    }

    // 주문 목록
    @GetMapping("/orders")
    String getOrders() {
        return "주문 목록";
    }

}
