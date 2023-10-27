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
        return "cart info";
    }

    @PostMapping("/items")
    public String putCart() {
        return "cart info";
    }

    @DeleteMapping("/{productId}")
    public String deleteCartItem(@PathVariable String productId) {
        return "deleted cart info";
    }
}
