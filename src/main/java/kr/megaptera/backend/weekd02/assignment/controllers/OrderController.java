package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    // 주문하기 메서드
    @PostMapping
    public String postOrder(@RequestAttribute String userId) {
        return "사용자의 주문 생성";
    }

    // 주문목록 조회 메서드
    @GetMapping
    public String getOrderList(@RequestAttribute String userId) {
        return "사용자의 주문 목록 조회";
    }
}
