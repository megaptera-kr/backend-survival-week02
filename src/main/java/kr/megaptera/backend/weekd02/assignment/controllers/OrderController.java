package kr.megaptera.backend.weekd02.assignment.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @PostMapping({"", "/"})
    @ResponseStatus(HttpStatus.CREATED)
    public String postOrders(
            @RequestAttribute int userId,
            @RequestBody String OrderDTO
    ) {
        return "주문하기\n";
    }

    @GetMapping({"", "/"})
    @ResponseStatus(HttpStatus.OK)
    public String getOrders(
            @RequestAttribute int userId
    ) {
        return "주문 목록\n";
    }
}
