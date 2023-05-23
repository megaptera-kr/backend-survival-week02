package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @PostMapping("/{productsId}")
    public String addCart (
            @PathVariable String productsId,
            @RequestAttribute String userId,
            @RequestBody String cartDto
    ) {
        return "카트 상품 추가 : " + productsId + "\n";
    }

    @DeleteMapping("/{productsId}")
    public String removeCart (
            @PathVariable String productsId,
            @RequestAttribute String userId
    ) {
        return "카트 상품 삭제 : " + productsId + "\n";
    }

    @GetMapping("/")
    public String list (@RequestAttribute String userId) {
        return "카트 상품 목록 \n";
    }
}
