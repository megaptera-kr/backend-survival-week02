package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ProductController {

    @GetMapping
    public String list(){
        return "상품 목록";
    }

    @GetMapping("/{items_id}")
    public String detail(
            @PathVariable String items_id
    ){
        return items_id + "의 상품정보";
    }
}
