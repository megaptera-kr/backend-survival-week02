package kr.megaptera.backend.weekd02.assignment.services;

import kr.megaptera.backend.weekd02.assignment.models.AddCartRequest;
import kr.megaptera.backend.weekd02.assignment.models.Cart;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class CartManager {
    private long idCounter;
    private Map<Long, Cart> carts;

    public CartManager() {
        idCounter = 0;
        carts = new HashMap<>();
        add("test", new AddCartRequest(1, 1));
    }

    public Cart[] getAll(String userId){
        var userCarts = new ArrayList<Cart>();

        for (var cart: carts.values()) {
            if(userId.equals(cart.getUserId())){
                userCarts.add(cart);
            }
        }

        return userCarts.toArray(new Cart[userCarts.size()]);
    }

    public Cart get(long cartId){
            return carts.get(cartId);
    }

    public Cart get(String userId, long productId){
        for (var cart : carts.values()) {
            if(!userId.equals(cart.getUserId())){
                continue;
            }

            if(productId != cart.getProductId()){
                continue;
            }

            return cart;
        }

        return null;
    }

    public Cart add(String userId, AddCartRequest request){

        var oldCart = get(userId, request.getProductId());
        if(oldCart != null){
            var sum = oldCart.getCount() + request.getCount();
            oldCart.setCount(sum);
            return oldCart;
        }
        else{
            var newCart = new Cart(
                    ++idCounter,
                    request.getProductId(),
                    request.getCount(),
                    userId,
                    LocalDateTime.now());


            carts.put(newCart.getId(), newCart);
            return newCart;
        }
    }

    public void remove(long cartId){
        carts.remove(cartId);
    }
}
