package kr.megaptera.backend.weekd02.assignment.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class CartController {

    @GetMapping("/products")
    public String getProductsByCart(@RequestAttribute String userId) {
        return "Products in User " + userId + " cart is loaded.";
    }

    @PostMapping("/products/{productId}")
    @ResponseStatus(HttpStatus.CREATED)
    public String addProductByCart(@RequestAttribute String userId, @PathVariable Long productId) {
        return "Product " + productId + " in User " + userId + " cart is added.";
    }

    @DeleteMapping("/products/{productId}")
    public String deleteProductByCart(@RequestAttribute String userId, @PathVariable Long productId) {
        return "Product " + productId + " in User " + userId + " cart is removed.";
    }

}
