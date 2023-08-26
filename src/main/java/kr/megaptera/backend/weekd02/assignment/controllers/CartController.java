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
@RequestMapping("/carts")
public class CartController {

    //장바구니에 상품 추가
    @PostMapping("/items")
    @ResponseStatus(HttpStatus.CREATED)
    public String addItem(
            @RequestBody String cartForm,
            @RequestAttribute String userId){
        return "장바구니에 상품 추가: " + userId + "\n" +  cartForm + "\n";
    }

    //장바구니에 상품 삭제
    @DeleteMapping("/items/{itemId}")
    public String deleteItem(@PathVariable String itemId, @RequestAttribute String userId){
        return "장바구니에 " + itemId + " 상품 삭제: " + userId + "\n";
    }

    // 장바구니 (담긴 상품 목록)
    @GetMapping
    public String getCart(@RequestAttribute("userId") String userId){
        return "담긴 상품 목록 조회(장바구니): " + userId + "\n";
    }
}