package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/{id}/cart")
public class CartController {
    @PostMapping("/{productId}")
    public String addCart(@PathVariable String id, @PathVariable String productId){
        return id + " 장바구니에 상품 추가 : " + productId;
    }

    @DeleteMapping("/{productId}")
    public String deleteCart(@PathVariable String id, @PathVariable String productId){
        return id + " 장바구니에 상품 삭제 : " + productId;
    }

    @GetMapping("/")
    public String getCartList(@PathVariable String id){
        return id + " 장바구니 (담긴 상품 목록)";
    }
}
