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
@RequestMapping("/users/me/cart_items")
public class CartController {
    @GetMapping
    public String cartList(
            @RequestAttribute String userId
    ) {
        return "장바구니조회\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addCartItems(
            @RequestAttribute String userId,
            @RequestBody String cartItemDTO
    ) {
        return "장바구니 상품 추가" + cartItemDTO + "\n";
    }

    @DeleteMapping("/{cart_items_id}")
    public String delCartItems(
            @RequestAttribute String userId,
            @PathVariable String cart_items_id
    ) {
        return "장바구니 상품 삭제 : " + cart_items_id + "\n";
    }
}
