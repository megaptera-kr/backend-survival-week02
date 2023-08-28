package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    //상품 목록
    @GetMapping
    public String getProducts() {
        return "상품 목록 \n";
    }

    //상품 상세 조회
    @GetMapping("/{productId}")
    public String getProduct(@PathVariable String productId)
    {
        return "상품 상세 조회: " + productId + "\n";
    }
}
