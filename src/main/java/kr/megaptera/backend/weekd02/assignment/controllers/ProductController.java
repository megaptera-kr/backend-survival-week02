package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public String list(){
        return "상품 목록\n";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable String id)
    {
        return "상품 상세정보\n";}
}
