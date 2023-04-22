package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {
    @GetMapping("/")
    public String getProductList(
            @RequestAttribute String userId
    ) {
        return "상품목록";
    }

    @GetMapping("/{id}")
    public String getProduct(
            @RequestAttribute String userId,
            @PathVariable String id
    ) {
        return "상품상세";
    }
}
