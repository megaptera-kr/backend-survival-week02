package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    // 상품 목록 조회 메서드
    @GetMapping
    public String getProductList() {
        return "상품목록 반환";
    }

    // 상품 상세 정보 조회 메서드
    @GetMapping("/{productId}")
    public String getProductDetail(@PathVariable long productId) {
        return "상품 상세 정보 반환\n상품 아이디 : " + productId;
    }
}
