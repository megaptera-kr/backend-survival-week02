package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @PostMapping("/carts/{product_id}")
    public String createCart(@PathVariable Long product_id) {
        return "장바구니에" + product_id  + "번 상품 추가";
    }

    @DeleteMapping("/carts/{cart_id}")
    public String deleteCart(@PathVariable Long cart_id) {
        return "장바구니에" + cart_id + "번 상품 제거";
    }

    @GetMapping("/carts/{user_id}")
    public String getCartList(@PathVariable Long user_id) {
        return user_id + "번 유저의 카트목록 가져오기";

    }
}
