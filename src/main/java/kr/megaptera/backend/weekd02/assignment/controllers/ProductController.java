package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class ProductController {

    @GetMapping("/products")
    public String productList() {
        return "상품 목록 노출 ";
    }

    @GetMapping("products/{product_id}")
    public String productDetail(@PathVariable String product_id) {
        return product_id + "번의 상품 상세 정보";
    }

}
