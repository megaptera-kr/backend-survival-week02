package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
    @GetMapping("/")
    public String list(){
        return "장바구니 상품 목록";
    }

    @PostMapping("/items")
    public String create(@PathVariable String id,@RequestBody String item){

        return "상품 추가";
    }
}
