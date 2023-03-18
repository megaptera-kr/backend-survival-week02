package kr.megaptera.backend.weekd02.assignment.services;

import kr.megaptera.backend.weekd02.assignment.models.Cart;
import kr.megaptera.backend.weekd02.assignment.models.Order;
import kr.megaptera.backend.weekd02.assignment.models.OrderedProduct;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class OrderManager {
    private Map<Long, Order> orders = new HashMap<>();
    private Map<Long, OrderedProduct> orderedProducts = new HashMap<>();

    // TODO : (dh) will be move service...
    public Order add(
            String userId,
            Cart[] carts) {

        var newOrderId = (long) orders.size() + 1;
        var newOrderProducts = addAll(newOrderId, carts);
        var newOrder = new Order(newOrderId, userId, LocalDateTime.now(), newOrderProducts);
        orders.put(newOrderId, newOrder);
        return newOrder;
    }

    private OrderedProduct[] addAll(long orderId, Cart[] carts) {
        var arrayList = new ArrayList<OrderedProduct>();

        for (var cart : carts) {
            var orderedProduct = add(orderId, cart);
            arrayList.add(orderedProduct);

        }

        return arrayList.toArray(new OrderedProduct[arrayList.size()]);
    }

    private OrderedProduct add(long orderId, Cart cart){
        var id = (long) orderedProducts.size() + 1;
        var orderedProduct = new OrderedProduct(
                id,
                orderId,
                cart.getProductId(),
                cart.getCount());

        orderedProducts.put(id, orderedProduct);
        return orderedProduct;
    }

    public Order[] getAll(String userId){
        var userOrders = new ArrayList<Order>();

        for (var order: orders.values()) {
            if(userId.equals(order.getUserId())){
                userOrders.add(order);
            }
        }

        return userOrders.toArray(new Order[orders.size()]);
    }
}
