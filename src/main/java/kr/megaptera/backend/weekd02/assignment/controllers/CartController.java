package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cart")
public class CartController {
    @GetMapping
    public String list(@RequestAttribute String userId) {
        return "장바구니 상품 조회: " + userId + "\n";
    }

    @PostMapping("items")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestAttribute String userId,
            @RequestBody String itemDto
    ) {
        return "장바구니 상품 추가" + itemDto + "\n";
    }

    @DeleteMapping("items/{id}")
    public String delete(
            @PathVariable String id,
            @RequestAttribute String userId
    ) {
        return "장바구니 상품 삭제: " + id + "\n";
    }
}