package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public String getProducts(
            @RequestAttribute String userId,
            @RequestBody String goodsDto) {
        return "상품 목록\n";
    }

    @GetMapping("/{goodsId}")
    public String getProductsDetail(
            @RequestBody String goodsDto) {
        return "상품 상세 : " + goodsDto + "\n";
    }
}
