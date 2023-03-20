package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @GetMapping("/items")
    @ResponseStatus(HttpStatus.OK)
    public String getCartItems(@RequestAttribute String userId) {
        return userId + "님의 장바구니(담긴 상품 목록) \n";
    }

    @PostMapping("/items")
    @ResponseStatus(HttpStatus.CREATED)
    public String addCartItem(@RequestBody String itemDTO,
                              @RequestAttribute String userId) {
        return userId + "님의 장바구니" + itemDTO + "상품추가 \n";
    }

    @DeleteMapping("/items/{itemId}")
    @ResponseStatus(HttpStatus.OK)
    public String removeCartItem(@RequestAttribute String userId, @PathVariable String itemId) {
        return userId + "님의 장바구니" + itemId + "삭제 \n";
    }
}
