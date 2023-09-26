package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String getListProduct(
            @RequestAttribute int userId
    ) {
        return "상품 목록\n";
    }

    @GetMapping({"/{productId}", "/{productId}/"})
    @ResponseStatus(HttpStatus.OK)
    public String getProduct(
            @RequestAttribute int userId,
            @PathVariable int productId
    ) {
        return "상품 상세\n";
    }
}
