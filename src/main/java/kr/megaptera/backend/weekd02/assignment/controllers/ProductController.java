package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getProductList(){
        return "상품목록 조회";
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String getProductInfo(@PathVariable int id){
        return "상품 상세 조회\n 상품 id : " + id;
    }
}
