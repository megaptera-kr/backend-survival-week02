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
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrders(
            @RequestAttribute String userId,
            @RequestBody String orderDTO
    ) {
        return "주문하기" + orderDTO + "\n";
    }

    @GetMapping
    public String ordersList() {
        return "주문목록조회\n";
    }
}
