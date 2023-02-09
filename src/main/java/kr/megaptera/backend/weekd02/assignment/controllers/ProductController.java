package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/yhjs1211")
public class ProductController {

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public String list() {
        String msg = "전체 상품 조회\n";
        return msg;
    }

    @GetMapping("/products/{product_id}")
    @ResponseStatus(HttpStatus.OK)
    public String detail(@PathVariable String product_id) {
        String msg = "선택 상품 : " + product_id + "\n";
        return msg;
    }
}
