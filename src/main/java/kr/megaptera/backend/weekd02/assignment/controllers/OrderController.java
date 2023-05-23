package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

public class OrderController {

    @PostMapping("/orders")
    public String createOrder(@RequestAttribute Long user_id , @RequestBody String order_info) {
        return user_id + "번 유저의" +order_info + "주문하기";

    }

    @GetMapping("/orders}")
    public String getOrders(@RequestAttribute String user_id) {
        return user_id + "번 유저의 주문 목록";
    }

}
