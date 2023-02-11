package kr.megaptera.backend.weekd02.assignment.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class CartController {

    @GetMapping
    public String getCarts(@RequestAttribute String userId) {
        return "Products in User " + userId + " cart are loaded.";
    }

    @PostMapping("/products/{productId}")
    @ResponseStatus(HttpStatus.CREATED)
    public String addCart(@RequestAttribute String userId, @PathVariable Long productId, @RequestBody String productOptions) {
        return "Products " + productId + " with options " + productOptions + " in User " + userId + " cart are added.";
    }

    @DeleteMapping("/{cartId}")
    public String deleteCart(@RequestAttribute String userId, @PathVariable Long cartId) {
        return "Products in Cart " + cartId + " are deleted by User " + userId + ".";
    }

}
