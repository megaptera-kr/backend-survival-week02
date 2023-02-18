package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping()
    public String getList() {

        return "상품 목록";
    }

    @GetMapping("/{id}")
    public String getDetail(@PathVariable String id) {

        return "상품 상세"+ id + "\n";
    }
}
