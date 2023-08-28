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
@RequestMapping("/cart-products")
public class CartController {
    // 장바구니에 상품 추가
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestAttribute String userId) {
        return "장바구니에 상품 추가\n";
    }

    // 장바구니에 상품 삭제
    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable String id,
            @RequestAttribute String userId
    ) {
        return "장바구니에 상품 삭제" + id + "\n";
    }

    // 장바구니 (담긴 상품 목록)
    @GetMapping
    public String list(@RequestAttribute String userId) {
        return "장바구니에 담긴 상품 목록\n";
    }
}
