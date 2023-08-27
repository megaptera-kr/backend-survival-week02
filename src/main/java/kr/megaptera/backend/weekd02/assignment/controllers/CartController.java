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
// cart 컬렉션 내에 items를 둠
@RequestMapping("/cart")
@RestController
public class CartController {

    @GetMapping
    public String getList(@RequestAttribute String userId){
        return "장바구니 목록";
    }

    @PostMapping("/items")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestBody String body,
            @RequestBody String itemDto
    ){
        return "장바구니 추가";
    }

    @DeleteMapping("/items/{itemId}")
    public String delete(
            @PathVariable String cartId,
            @RequestAttribute String userId
    ){
        return "장바구니 상품 삭제";
    }

}
