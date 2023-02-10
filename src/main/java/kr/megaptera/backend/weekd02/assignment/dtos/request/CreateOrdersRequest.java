package kr.megaptera.backend.weekd02.assignment.dtos.request;

import java.util.List;

public class CreateOrdersRequest {
  private List<Long> productIds;

  public CreateOrdersRequest() {
  }

  public CreateOrdersRequest(List<Long> productIds) {
    this.productIds = productIds;
  }

  public List<Long> getProductIds() {
    return productIds;
  }
}
