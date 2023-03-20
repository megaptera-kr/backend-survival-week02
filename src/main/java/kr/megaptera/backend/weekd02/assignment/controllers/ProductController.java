package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getProducts() {
        return "상품 목록 \n";
    }

    @GetMapping("/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public String getProduct(@PathVariable String productId) {
        return "상품 상세조회 :" + productId + "\n";
    }
}
