package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart-items")
public class CartController {

  @PostMapping("/{id}")
  public String addProduct(@PathVariable(name = "id") Long id) {
    return String.format("장바구니에 상품번호 %d가 추가됩니다.", id);
  }

  @DeleteMapping("/{id}")
  public String removeProduct(@PathVariable(name = "id") Long id) {
    return String.format("장바구니에서 상품번호 %d가 제거됩니다.", id);
  }

  @GetMapping()
  public String getCart() {
    return "장바구니에 담긴 상품목록을 반환합니다.";
  }
}
