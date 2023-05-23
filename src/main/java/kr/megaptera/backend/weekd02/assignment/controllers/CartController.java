package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    @GetMapping
    public String cartList(@RequestAttribute String userId) {
        return "장바구니 상품 조회: " + userId + "\n";
    }

    @PostMapping("/{productId}")
    public String addCart(
            @PathVariable String userId,
            @RequestBody String cartDto
    ){
        return "카트 상품추가:"+cartDto;
    }

    @DeleteMapping("items/{productId}")
    public String delete(
            @PathVariable String id,
            @RequestAttribute String userId
    ) {
        return "장바구니 상품 삭제: " + id + "\n";
    }

}
