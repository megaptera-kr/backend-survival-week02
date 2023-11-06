package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    @GetMapping("/items")
    public String getCartItems() {
        return "장바구니 조회";
    }

    @PostMapping("/items")
    public String putCart() {
        return "장바구니 추가";
    }

    @DeleteMapping("/{productId}")
    public String deleteCartItem(@PathVariable String productId) {
        return "deleted item " + productId + " from cart";
    }
}
