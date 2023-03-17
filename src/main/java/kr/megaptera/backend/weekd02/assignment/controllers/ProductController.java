package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping
    public String list(@RequestAttribute String userId) {
        return "상품 목록\n";
    }

    @GetMapping("/{id}")
    public String getProductInfo(@PathVariable("id") String productId, @RequestAttribute String userId) {
        return productId + "번 상세 정보\n";
    }
}


