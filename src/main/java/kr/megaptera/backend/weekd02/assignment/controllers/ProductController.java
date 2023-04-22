package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/")
    public String list() {
        return "상품 목록\n";
    }

    @GetMapping("/{productsId}")
    public String detail(@PathVariable String productsId) {
        return "상품 상세 : " + productsId + "\n";
    }
}
