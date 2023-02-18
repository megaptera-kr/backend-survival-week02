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
@RequestMapping("/carts")
public class CartController {
    // 장바구니에 상품추가
    @PostMapping
    public String addCart(@RequestAttribute String userId,
                          @RequestBody String productId

    ) {
        return "사용자의 장바구니에 상품 %s 추가".formatted(productId);
    }

    // 장바구니에 상품 삭제
    @DeleteMapping("/{productId}")
    public String deleteCart(@PathVariable String productId,
                             @RequestAttribute String userId
    ) {
        return "사용자의 장바구니에서 상품 %s 제거".formatted(productId);
    }

    // 장바구니에 담긴 상품 목록
    @GetMapping
    public String getCartList(@RequestAttribute String userId
    ) {
        return "사용자 %s의 장바구니 목록 조회".formatted(userId);
    }
}
