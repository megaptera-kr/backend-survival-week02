package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// users내에 orders를 두기보다,
// orders내에서 user를 관리하도록 수정
@RequestMapping("/orders")
@RestController
public class OrderController {

    @PostMapping
    public String create(
            @RequestAttribute String userId,
            @RequestBody String orderDto){
        return "주문 하기";
    }

    @GetMapping
    public String getList(@RequestAttribute String userId){
        return "주문 목록";
    }
}
