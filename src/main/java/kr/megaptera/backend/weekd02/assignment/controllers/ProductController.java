package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    private String productList() {
        return "상품 목록 불러오기";
    }

    @GetMapping("/{id}")
    private String product(@PathVariable String id) {
        return "상품 상세 불러오기 : " + "'" + id + "'";
    }
}
