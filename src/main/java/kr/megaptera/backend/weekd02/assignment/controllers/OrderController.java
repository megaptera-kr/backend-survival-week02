package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static final List<String> orderList = new ArrayList<>();
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String createOrder(@RequestParam String orderItem){
        orderList.add(orderItem);
        return "주문하기\n 주문상품명 : " + orderItem;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getOrderList(){
        String message = "주문 목록\n";
        message += String.join("\n", orderList);
        return message;
    }
}
