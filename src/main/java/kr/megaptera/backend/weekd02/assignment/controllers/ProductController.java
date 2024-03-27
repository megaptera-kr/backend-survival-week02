package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.config.message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
  @GetMapping
  public String getList(){
    return message.makeMassage("상품 목록",null);
  }
  @GetMapping("/{id}")
  public String detail(@PathVariable("id")String id){
      return message.makeMassage("상품 상세",id);
  }
}
