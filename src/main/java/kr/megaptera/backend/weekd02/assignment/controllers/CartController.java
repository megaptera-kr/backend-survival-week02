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

    @GetMapping
    public String list(){
        return "장바구니 목록\n";
    }

    @PostMapping()
    public String insertCart(
        @RequestAttribute String userId,
        @RequestBody String productDTO
    ){
        return "장바구니에" + productDTO + " 상품 추가 \n";
    }

    @DeleteMapping("/{cartId}/{productId}")
    public String deleteCartInProduct(
        @PathVariable String cartId,
        @PathVariable String productId,
        @RequestAttribute String userId
    ){
        return cartId + "번 장바구니에있는" + productId + "번 상품 삭제\n";
    }
}
