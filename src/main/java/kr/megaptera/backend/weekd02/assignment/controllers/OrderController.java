package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestBody String orderInfoDTO
    ) {

        return "주문하기"+ orderInfoDTO + "\n";
    }

    @GetMapping
    public String list() {

        return "주문 목록 \n";
    }

}
