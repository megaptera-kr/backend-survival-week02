package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public String list() {
        return "상품목록";
    }

    @GetMapping("/{id}")
    public String listId(@PathVariable String id,
                         @RequestAttribute String userId
    ) {
        return "상품상세 id: " + id;
    }

}
