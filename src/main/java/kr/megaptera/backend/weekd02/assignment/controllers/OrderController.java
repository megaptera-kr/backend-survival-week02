package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users/{userid}/orders")
@RestController
public class OrderController {

    @PostMapping
    public String create(@RequestAttribute String body){
        return "주문 하기";
    }

    @GetMapping
    public String getList(){
        return "주문 목록"
    }
}
