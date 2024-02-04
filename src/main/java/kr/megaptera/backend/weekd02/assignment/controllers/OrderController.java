package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public String getOrders() {
        return "Orders are returned";
    }

    @GetMapping("/{orderId}")
    public String getOrderInfo(@RequestAttribute String orderId) {
        return "Order " + orderId + " information is returned";
    }
}
