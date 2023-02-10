package kr.megaptera.backend.weekd02.assignment.dtos.response;

import java.util.List;
import kr.megaptera.backend.weekd02.assignment.domains.Order;

public class GetOrdersResponse {
  private final List<Order> orders;

  public GetOrdersResponse(List<Order> orders) {
    this.orders = orders;
  }

  public List<Order> getOrders() {
    return orders;
  }
}
