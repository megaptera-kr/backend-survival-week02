package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/me/cart/products")
public class CartController {

    @PostMapping({"", "/"})
    @ResponseStatus(HttpStatus.OK)
    public String addProductsToCart(
            @RequestAttribute int userId,
            @RequestBody String CartDTO
    ) {
        return "장바구니에 상품 추가\n";
    }

    @DeleteMapping({"", "/"})
    @ResponseStatus(HttpStatus.OK)
    public String deleteProductsFromCart(
            @RequestAttribute int userId
    ) {
        return "장바구니에 상품 삭제\n";
    }

    @GetMapping({"", "/"})
    @ResponseStatus(HttpStatus.OK)
    public String getProductsInCart(
            @RequestAttribute int userId
    ) {
        return "장바구니 (담긴 상품 목록)\n";
    }
}
