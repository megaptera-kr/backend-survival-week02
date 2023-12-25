package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
public class CartController {

    // 장바구니에 상품 추가
    @PostMapping("/{cart_id}")
    String addItem(@PathVariable String cart_id, @RequestBody String item_id) {
        return "장바구니 " + cart_id + "에 상품 추가 : " + "상품 : " + item_id;
    }

    // 장바구니에 상품 삭제

    @DeleteMapping("/{cart_id}")
    String removeItem(@PathVariable String cart_id, @RequestBody String item_id) {
        return "장바구니 " + cart_id + "에 상품 삭제 : " + "상품 : " + item_id;
    }


    // 장바구니(담긴 상품 목록) :GET /carts/

    @GetMapping("{cart_id}")
    String getItems(@PathVariable String cart_id) {
        return "장바구니 " + cart_id + "(담긴 상품 목록)";
    }
    
}
