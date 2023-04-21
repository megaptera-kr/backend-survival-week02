package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    private String products() {
        return "상품 목록 조회";
    }

    @GetMapping("/{productId}")
    private String product(@PathVariable Long productId) {
        return "상품 상세 조회";
    }
}
