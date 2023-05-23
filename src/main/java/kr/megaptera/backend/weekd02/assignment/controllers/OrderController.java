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

    @GetMapping()
    public String orderList(){
        return "주문 목록\n";
    }

    @PostMapping()
    public String createOrder(
        @RequestAttribute String userId,
        @RequestBody String orderDTO
    ){
        return "주문 생성" + orderDTO + "\n";
    }
}
