package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getOrders(@RequestAttribute String userId) {
        return userId + "님의 주문 목록 \n";
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String createOrder(@RequestBody String orderDTO, @RequestAttribute String userId) {
        return userId + "님 주문 완료 :" + orderDTO + "\n";
    }


}
