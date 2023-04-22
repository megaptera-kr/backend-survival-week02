package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class CartController {

    @PostMapping("/")
    public String setCart(
        @RequestBody String product_id,
        @RequestAttribute String userId
    ) {
        return "상품 추가";
    }

    @DeleteMapping("/{id}")
    public String deleteCart(
        @PathVariable String id,
        @RequestAttribute String userId
    ) {
        return "상품 삭제";
    }

    @GetMapping("/")
    public String getCart(
        @RequestAttribute String userId
    ) {
        return "장바구니";
    }
}
