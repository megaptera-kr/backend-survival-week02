package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    // 장바구니 조회
    @GetMapping("cart")
    public String getCart(
            @RequestAttribute("userId") String userId
    ) {
        return userId + "님의 장바구니입니다.\n";
    }

    // 특정 상품을 장바구니에 넣기
    @GetMapping("products/{productId}/cart")
    public String addProductFromCart(
            @RequestAttribute("userId") String userId,
            @PathVariable("productId") String productId
    ) {
        return userId + "님이 " + productId + "번 상품을 장바구니에 넣었습니다.\n";
    }

    // 특정 상품을 장바구니에서 빼기
    @DeleteMapping("products/{productId}/cart")
    public String deleteProductFromCart(
            @RequestAttribute("userId") String userId,
            @PathVariable("productId") String productId
    ) {
        return userId + "님이 " + productId + "번 상품을 장바구니에서 삭제했습니다.\n";
    }
}
