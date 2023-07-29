package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CartController {
    // 장바구니에 상품 추가
    @PostMapping("/cart")
    @ResponseStatus(HttpStatus.CREATED)
    public String add(@RequestAttribute String userId) {
        return "방바구니에 상품 추가: " + userId;
    }

    // 장바구니에 상품 삭제
    @DeleteMapping("/cartItems/{cartItemId}")
    public String delete(
            @PathVariable String cartItemId,
            @RequestAttribute String userId
    ) {
        return "장바구니에 상품 삭제: " + userId + ":" + cartItemId;
    }

    // 장바구니 (담긴 상품 목록)
    @GetMapping("/cart")
    public String list(@RequestAttribute String userId) {
        return "장바구니 (담긴 상품 목록): " + userId;
    }
}
