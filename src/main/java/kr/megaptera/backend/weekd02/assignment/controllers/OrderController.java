package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping
    public String list() {
        return "주문정보 전체 조회";
    }

    @PostMapping
    public String create(@RequestBody String body) {
        return "주문 생성 완료 " + body + "\n";
    }

}
