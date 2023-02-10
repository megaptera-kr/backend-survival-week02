package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.dtos.request.AddProductsRequest;
import kr.megaptera.backend.weekd02.assignment.dtos.response.AddProductsResponse;
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

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public AddProductsResponse addProducts(@RequestAttribute Long userId,
      @RequestBody AddProductsRequest request) {

    return new AddProductsResponse(request.getProductIds());
  }

  @DeleteMapping("/products/{productsId}")
  public String deleteProduct(@RequestAttribute Long userId,
      @PathVariable Long productsId) {

    return "삭제 성공: " + productsId;
  }

  @GetMapping
  public String getCartList(@RequestAttribute Long userId) {
    return "productIds: " + "1, 2, 3";
  }

}
