package kr.megaptera.backend.weekd02.assignment.dtos.response;

import java.util.List;

public class AddProductsResponse {
  private final List<Long> products;

  public AddProductsResponse(List<Long> products) {
    this.products = products;
  }

  public List<Long> getProducts() {
    return products;
  }
}
