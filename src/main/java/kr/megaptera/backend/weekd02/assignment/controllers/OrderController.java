package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {
    // 주문하기 (현재 장바구니)
    @GetMapping("/cart")
    public String createOrder(
            @RequestAttribute("userId") String userId
    ) {
        return userId + "님께서 장바구니에 담은 상품을 주문합니다.\n";
    }

    // 자신의 주문 목록 조회
    @GetMapping("/me")
    public String getMyOrders(
            @RequestAttribute("userId") String userId
    ) {
        return userId + "님의 주문 목록을 조회합니다.\n";
    }
}
