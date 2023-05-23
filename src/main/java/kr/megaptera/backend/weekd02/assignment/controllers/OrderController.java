package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping
    private String list(@RequestAttribute String userId) {
        return "주문 목록 \n" + "유저 ID : " + userId + "\n" + "주문 목록 리스트...";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private String create(@RequestAttribute String userId, @RequestBody String orderDTO) {
        return "주문하기 \n" + "유저 ID : " + userId + "\n" + "주문 정보 : \n" + orderDTO;
    }
}
