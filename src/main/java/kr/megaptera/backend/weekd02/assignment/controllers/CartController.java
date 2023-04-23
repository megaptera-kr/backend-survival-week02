package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cart")
public class CartController {
    @GetMapping
    public String cartList(@RequestAttribute String userId) {
        return "장바구니 상품 조회 : " + userId + "\n";
    }

    @PostMapping("items")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestBody String item,
            @RequestAttribute String userId
    ) {
        return "장바구니 상품 추가 : " + item + "\n";
    }

    @DeleteMapping("items/{id}")
    public String delete(
            @PathVariable String id,
            @RequestAttribute String userId
    ) {
        return "장바구니 상품 삭제 : " + id + " / 유저 id : " + userId + "\n";
    }
}
