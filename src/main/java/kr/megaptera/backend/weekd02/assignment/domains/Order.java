package kr.megaptera.backend.weekd02.assignment.domains;

import java.util.List;

public class Order {
  private final Long id;
  private final Long userId;
  private final List<Long> productIds;

  public Order(Long id, Long userId, List<Long> productIds) {
    this.id = id;
    this.userId = userId;
    this.productIds = productIds;
  }

  public Long getId() {
    return id;
  }

  public Long getUserId() {
    return userId;
  }

  public List<Long> getProductIds() {
    return productIds;
  }
}
