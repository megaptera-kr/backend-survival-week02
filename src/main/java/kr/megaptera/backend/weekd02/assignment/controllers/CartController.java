package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts/{cartId}/products")
public class CartController {
    @GetMapping
    private String list(@PathVariable("cartId") String cartId, @RequestAttribute String userId) {
        return "장바구니 (담긴 상품 목록 가져오기) \n" + "장바구니 ID : " + cartId + "\n" + "유저 ID : " + userId + "\n" + "상품 리스트 ....";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private String create(@PathVariable("cartId") String cartId, @RequestAttribute String userId, @RequestBody String productDTO) {
        return "장바구니에 상품 추가 입니다. \n" + "카트 ID : " + cartId + "\n" + "유저 ID : " + userId + "\n" + productDTO;
    }

    @DeleteMapping("/{productId}")
    private String delete(@PathVariable("cartId") String cartId, @PathVariable("productId") String productId, @RequestAttribute String userId) {
        return "장바구니에 상품 삭제 입니다. \n" + "카트 ID : " + cartId + "\n" + "유저 ID : " + userId + "\n" + "상품 ID : " + productId;
    }
}
