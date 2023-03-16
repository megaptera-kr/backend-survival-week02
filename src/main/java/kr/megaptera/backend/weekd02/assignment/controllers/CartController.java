package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @GetMapping
    public String list(){return "상품목록\n";}

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String add(
            @RequestAttribute String userId,
            @RequestBody(required = false) String productDTO
    )
    {
        return "상품:" + productDTO+ "추가 완료\n";
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable String id,
            @RequestAttribute String userId){
        return "상품 삭제" + id +"\n";
    }


}
