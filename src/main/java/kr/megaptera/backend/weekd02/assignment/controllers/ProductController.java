package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ProductController {

    // 상품 목록
    @GetMapping
    String getItems() {
        return "상품 목록";
    }

    // 상품 상세
    @GetMapping("/{item_id}")
    String getItem(@PathVariable String item_id) {
        return "상품 상세 : " + item_id;
    }
}
