package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class CartController {

    @GetMapping
    public String getCarts() {
        return "Carts are returned";
    }

    @PostMapping("/{productId}")
    public String addProductToCart(@PathVariable String productId) {
        return "Product " + productId + " is added to cart";
    }

    @DeleteMapping("/{productId}")
    public String deleteProductFromCart(@PathVariable String productId) {
        return "Product " + productId + " is deleted from cart";
    }
}
