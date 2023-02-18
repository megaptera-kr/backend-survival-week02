package kr.megaptera.backend.weekd02.assignment.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @GetMapping
    public String getCarts(@RequestAttribute String userId) {
        return "Items to User " + userId + " cart are loaded.";
    }

    @PostMapping("/items/{itemId}")
    @ResponseStatus(HttpStatus.CREATED)
    public String addItemToCart(@RequestAttribute String userId, @PathVariable Long itemId) {
        return "Items " + itemId + " to User " + userId + " cart are added.";
    }

    @DeleteMapping("/items/{itemId}")
    public String deleteItemToCart(@RequestAttribute String userId, @PathVariable Long itemId) {
        return "Items to Cart " + itemId + " are deleted by User " + userId + ".";
    }

}
