package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @PostMapping()
    public String createOrder() {
        return "orders";
    }

    @GetMapping()
    public String getOrders() {
        return "orders";
    }

    @GetMapping("/{orderId}")
    public String getOrder(@PathVariable String orderId) {
        return "order details";
    }
}
