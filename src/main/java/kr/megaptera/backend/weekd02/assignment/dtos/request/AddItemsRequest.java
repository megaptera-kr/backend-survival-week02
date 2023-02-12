package kr.megaptera.backend.weekd02.assignment.dtos.request;

import java.util.List;

public class AddItemsRequest {
  private List<Long> productIds;

  public AddItemsRequest() {
  }

  public AddItemsRequest(List<Long> productIds) {
    this.productIds = productIds;
  }

  public List<Long> getProductIds() {
    return productIds;
  }
}
