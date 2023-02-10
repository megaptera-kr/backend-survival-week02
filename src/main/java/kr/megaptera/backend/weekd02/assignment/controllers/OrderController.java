package kr.megaptera.backend.weekd02.assignment.controllers;

import java.util.Arrays;
import java.util.List;
import kr.megaptera.backend.weekd02.assignment.domains.Order;
import kr.megaptera.backend.weekd02.assignment.dtos.request.CreateOrdersRequest;
import kr.megaptera.backend.weekd02.assignment.dtos.response.CreateOrdersResponse;
import kr.megaptera.backend.weekd02.assignment.dtos.response.GetOrdersResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public CreateOrdersResponse createOrders(@RequestAttribute Long userId,
      @RequestBody CreateOrdersRequest request) {
    return new CreateOrdersResponse(request.getProductIds());
  }

  @GetMapping
  public GetOrdersResponse getOrders(@RequestAttribute Long userId) {
    List<Order> orders = Arrays.asList(new Order(1L, userId, Arrays.asList(1L, 2L, 3L)),
        new Order(1L, userId, Arrays.asList(4L, 5L, 6L)));
    return new GetOrdersResponse(orders);

  }
}
