package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {
    @GetMapping
    public String productList() {
        return "상품 목록\n";
    }

    @GetMapping("{id}")
    public String ProductDetail(@PathVariable String id) {
        return "상품 상세 : " + id + "\n";
    }
}
