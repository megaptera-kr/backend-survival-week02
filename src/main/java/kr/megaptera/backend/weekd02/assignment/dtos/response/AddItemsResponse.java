package kr.megaptera.backend.weekd02.assignment.dtos.response;

import java.util.List;

public class AddItemsResponse {
  private final List<Long> products;

  public AddItemsResponse(List<Long> products) {
    this.products = products;
  }

  public List<Long> getProducts() {
    return products;
  }
}
