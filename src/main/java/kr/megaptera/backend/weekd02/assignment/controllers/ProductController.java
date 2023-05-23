package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    // 상품 목록 보기
    @GetMapping
    public String getProducts() {
        return "전체 상품 목록\n";
    }

    // 상품 상세 보기
    @GetMapping("/{productId}")
    public String getProduct(@PathVariable("productId") String productId) {
        return productId + "번 상품 상세 정보\n";
    }
}
