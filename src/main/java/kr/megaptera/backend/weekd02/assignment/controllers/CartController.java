package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
    @GetMapping("{userId}")
    public String showProduct(@PathVariable String userId) {
        return userId + "번 손님이 가지고 있는 장바구니 목록\n";
    }
    @PostMapping("{productId}")
    @ResponseStatus(HttpStatus.CREATED)
    public String addProduct(@PathVariable String productId, @RequestAttribute String userId) {
        return userId+ "번 손님의 " + "장바구니에 추가된 상품" + productId + "\n";
    }

    @DeleteMapping("{productId}")
    public String deleteProduct (@PathVariable String productId, @RequestAttribute String userId) {
        return userId+ "번 손님의 " + "장바구니에서 삭제된 상품" + productId + "\n";
    }
}
