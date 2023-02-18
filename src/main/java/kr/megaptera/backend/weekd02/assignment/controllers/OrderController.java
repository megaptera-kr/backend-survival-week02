package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/yhjs1211/order")
public class OrderController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String orderList() {
        String msg = "주문 목록 조회 완료\n";
        return msg;
    }

    @PostMapping("?cart={cart}")
    @ResponseStatus(HttpStatus.OK)
    public String order(@RequestBody(required = false) String body) {
        String msg = "주문 완료\n";
        return msg;
    }
}
