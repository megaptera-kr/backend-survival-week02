package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @PostMapping("/{productId}")
    public String order(@PathVariable String productId){
        return "주문하기 : " + productId;
    }
    @GetMapping("/")
    public String orderList(){
        return "주문 목록";
    }
}
