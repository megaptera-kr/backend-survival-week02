package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

  @GetMapping
  public String getProducts() {
    return "상품 목록을 보여줍니다.";
  }

  @GetMapping("/{id}")
  public String getProductDetail(@PathVariable Long id) {
    if (id < 0) {
      throw new IllegalArgumentException();
    }
    return String.format("상품 번호 %d의 상품 정보를 상세히 반환합니다.", id);
  }

  @ExceptionHandler(IllegalArgumentException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String impossibleId() {
    return "불가능한 id입니다. id는 0이상의 정수만 가능합니다.";
  }
}
