package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderController {

    @PostMapping("/")
    public String setOrder(
        @RequestAttribute String userId,
        @RequestBody String orderDto
    ) {
        return "주문하기";
    }

    @GetMapping("/")
    public String getOrder(
        @RequestAttribute String userId
    ) {
        return "주문목록";
    }
}
