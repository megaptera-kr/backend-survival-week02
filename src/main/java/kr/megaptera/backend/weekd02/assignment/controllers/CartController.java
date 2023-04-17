package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart/products")
public class CartController {
    @GetMapping
    public String listCart() {
        return "장바구니 상품 목록";
    }


    @PostMapping
    public String addCart(@RequestBody String productDto) {
        //@RequestBody로 body에 있는 json문자열을 객체로 받아올 수 있다.
        return "장바구니 상품 추가\n" + productDto;
    }

    @DeleteMapping("/{productId}")
    public String deleteCart(@PathVariable String productId) {
        return "장바구니 상품(id = " + productId + ") 삭제";
    }
}
