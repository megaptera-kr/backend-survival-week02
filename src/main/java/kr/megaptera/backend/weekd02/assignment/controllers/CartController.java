package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carts")
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
