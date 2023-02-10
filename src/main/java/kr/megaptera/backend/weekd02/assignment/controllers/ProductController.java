package kr.megaptera.backend.weekd02.assignment.controllers;

import java.util.Arrays;
import java.util.List;
import kr.megaptera.backend.weekd02.assignment.domains.Product;
import kr.megaptera.backend.weekd02.assignment.dtos.response.GetProductResponse;
import kr.megaptera.backend.weekd02.assignment.dtos.response.GetProductsResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

  @GetMapping
  public GetProductsResponse getProducts() {
    List<Product> products = Arrays.asList(
        new Product(1L, "맥북프로"), new Product(2L, "아이패드"));

    return new GetProductsResponse(products);
  }

  @GetMapping("/{id}")
  public GetProductResponse getProduct(@PathVariable Long id) {
    Product product = new Product(id, "맥북프로");

    return new GetProductResponse(product);
  }
}
