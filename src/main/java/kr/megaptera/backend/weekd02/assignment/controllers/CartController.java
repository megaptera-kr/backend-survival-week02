package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.config.message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
  @GetMapping
  public String getList(@RequestAttribute String userId){
    return message.makeMassage("장바구니",userId);
  }
  @PostMapping
  public String addProduct(@RequestAttribute String userId,@RequestBody String productId){
    return message.makeMassage("장바구니에 상품 추가",productId);
  }

  @DeleteMapping("/{id}")
  public String removeProduct(@PathVariable("id")String productId,@RequestAttribute String userId){
    return message.makeMassage("장바구니에 상품 삭제",productId);
  }

}
