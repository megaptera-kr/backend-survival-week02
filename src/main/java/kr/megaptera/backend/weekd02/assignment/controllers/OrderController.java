package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    //주문하기
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrder(@RequestBody String orderForm, @RequestAttribute String userId){
        return "주문하기: " + userId + "\n" +  orderForm + "\n";
    }

    //주문 목록 조회
    @GetMapping
    public String getOrders(@RequestAttribute String userId){
        return userId + " 사용자의 주문 목록 조회 \n";
    }
}
