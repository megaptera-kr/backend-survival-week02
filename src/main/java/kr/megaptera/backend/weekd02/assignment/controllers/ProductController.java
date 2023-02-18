package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ProductController {
    @GetMapping
    public String productList() {
        return "상품목록\n";
    }

    @GetMapping("/{items_id}")
    public String productDetail(@PathVariable String items_id) {
        return "상품목록상세 : " + items_id + "\n";
    }
}
