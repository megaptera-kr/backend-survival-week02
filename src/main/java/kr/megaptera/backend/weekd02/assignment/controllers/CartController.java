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
@RequestMapping("/carts/{cartId}/items")
public class CartController {
    @GetMapping
    private String items(
        @PathVariable Long cartId,
        @RequestAttribute String userId
        ) {
        return "장바구니 상품 목록 조회";
    }

    @PostMapping("/{itemId}")
    private String createItem(
        @PathVariable Long cartId,
        @PathVariable Long itemId,
        @RequestAttribute String userId,
        @RequestBody String itemDto
    ) {
        return "장바구니에 상품 추가" + itemDto + "\n";
    }

    @DeleteMapping("/{itemId}")
    private String deleteItem(
        @PathVariable Long cartId,
        @RequestAttribute String userId,
        @PathVariable Long itemId
    ) {
        return "장바구니 상품 삭제" + itemId + "\n";
    }
}
