package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("{userId}")
    public String getUserProducts(@RequestAttribute String userId) {
        return "주문 목록";
    }
    @PostMapping("{productId}")
    public String orderProduct(@PathVariable String productId, @RequestAttribute String userId) {
        return "주문한 상품 번호 " + productId + "\n";
    }


    @DeleteMapping("{productId}")
    public String deleteProduct (@PathVariable("productId") String productId, @RequestAttribute String userId) {
        return userId+ "번 손님의 " + "장바구니에서 삭제된 상품" + productId + "\n";
    }
}
