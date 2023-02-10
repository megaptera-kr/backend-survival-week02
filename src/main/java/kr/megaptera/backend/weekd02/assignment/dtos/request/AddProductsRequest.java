package kr.megaptera.backend.weekd02.assignment.dtos.request;

import java.util.List;

public class AddProductsRequest {
  private List<Long> productIds;

  public AddProductsRequest() {
  }

  public AddProductsRequest(List<Long> productIds) {
    this.productIds = productIds;
  }

  public List<Long> getProductIds() {
    return productIds;
  }
}
