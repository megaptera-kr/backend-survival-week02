package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public String getOrders(
            @RequestAttribute String userId,
            @RequestBody String orderDTO
    ) {
        return "주문 목록 \n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrders(
            @RequestAttribute String userId,
            @RequestBody String orderDTO
    ) {
        return "주문 생성\n";
    }
}
