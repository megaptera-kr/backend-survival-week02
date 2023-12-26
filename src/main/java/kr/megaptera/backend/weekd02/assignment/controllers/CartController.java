package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart/goods")
public class CartController {

    @PostMapping
    public String addGoodsToCart(
            @RequestBody String goodsDto,
            @RequestAttribute String userId
    ) {
        return "상품을 장바구니에 담았습니다.\n";
    }

    @DeleteMapping("/{goodsId}")
    public String deleteGoodsFromCart(
            @RequestAttribute String userId,
            @RequestBody String goodsDto
    ) {
        return "장바구니에서 상품을 삭제했습니다.\n";
    }

    @GetMapping
    public String getGoodsFromCart(
            @RequestAttribute String userId,
            @RequestBody String goodsDto
    ) {
        return "장바구니에서 상품을 조회했습니다.\n";
    }

}
