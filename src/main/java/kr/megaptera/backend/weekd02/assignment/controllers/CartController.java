package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.dtos.request.AddItemsRequest;
import kr.megaptera.backend.weekd02.assignment.dtos.response.AddItemsResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

  @PostMapping("/items")
  @ResponseStatus(HttpStatus.CREATED)
  public AddItemsResponse addItems(@RequestAttribute Long userId,
      @RequestBody AddItemsRequest request) {

    return new AddItemsResponse(request.getProductIds());
  }

  @DeleteMapping("/items/{itemsId}")
  public String deleteProduct(@RequestAttribute Long userId,
      @PathVariable Long itemsId) {

    return "삭제 성공: " + itemsId;
  }

  @GetMapping
  public String getCartList(@RequestAttribute Long userId) {
    return "itemIds: " + "1, 2, 3";
  }

}
