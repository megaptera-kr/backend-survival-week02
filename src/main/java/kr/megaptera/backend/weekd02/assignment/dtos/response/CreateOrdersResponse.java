package kr.megaptera.backend.weekd02.assignment.dtos.response;

import java.util.List;

public class CreateOrdersResponse {
  private List<Long> products;

  public CreateOrdersResponse() {
  }

  public CreateOrdersResponse(List<Long> products) {
    this.products = products;
  }

  public List<Long> getProducts() {
    return products;
  }
}
