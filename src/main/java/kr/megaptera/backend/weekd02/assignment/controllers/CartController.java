package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    @GetMapping
    public String list() {
        return "장바구니 (담긴 상품 목록)";
    }

    @PostMapping("/items")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestBody String cartDTO
    ) {
        return "{\"action\": \"장바구니에 상품 추가\", \"body\": \"" + cartDTO.replace("\"", "\\\"") + "\"}";
    }

    @DeleteMapping("/items/{product_id}")
    public String delete(
            @PathVariable("product_id") String id
    ) {
        return "장바구니에 상품 삭제: " + id;
    }

}
