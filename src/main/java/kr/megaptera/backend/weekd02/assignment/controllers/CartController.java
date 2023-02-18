package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/yhjs1211/cart")
public class CartController {

    @PostMapping("?product-id={product_id}")
    @ResponseStatus(HttpStatus.CREATED)
    public String addItem(
            @PathVariable String product_id,
            @RequestAttribute("userId") String userId,
            @RequestBody(required = false) String body
    ) {
        String msg = "카트에 상품번호(" + product_id + ")가 담겼습니다.\n";
        return msg;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String cartItems() {
        String msg = "카트에 담긴 상품이 조회되었습니다.\n";
        return msg;
    }

    @DeleteMapping("?product-id={product_id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteItem(
            @PathVariable String product_id,
            @RequestAttribute("userId") String userId
    ) {
        String msg = "카트에 상품번호(" + product_id + ")가 삭제되었습니다.\n";
        return msg;
    }
}
