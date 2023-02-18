package kr.megaptera.backend.weekd02.assignment.dtos.response;

import java.util.List;
import kr.megaptera.backend.weekd02.assignment.domains.Product;

public class GetProductsResponse {
  private final List<Product> products;

  public GetProductsResponse(List<Product> products) {
    this.products = products;
  }

  public List<Product> getProducts() {
    return products;
  }
}
