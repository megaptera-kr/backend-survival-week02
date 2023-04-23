package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @PostMapping("/items")
    public String addProduct(String member, @RequestBody String item) {
        return "장바구니에 상품 추가";
    }

    @DeleteMapping("/items/{cart_item_number")
    public String delete(@PathVariable(value = "cart_item_number") String itemNo, String member) {
        return "장바구니 삭제";
    }

    @GetMapping("items")
    public String list() {
        return "장바구니";
    }
}
