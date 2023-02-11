package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
  @PostMapping
  public String doOrder() {
    return "장바구니에 담긴 상품들이 주문되었습니다.";
  }

  @GetMapping
  public String getOrderList() {
    return "주문 목록을 보여줍니다.";
  }
}
