package kr.megaptera.backend.weekd02.assignment.dtos.response;

import kr.megaptera.backend.weekd02.assignment.domains.Product;

public class GetProductResponse {
  private final Product product;

  public GetProductResponse(Product product) {
    this.product = product;
  }

  public Product getProduct() {
    return product;
  }
}
