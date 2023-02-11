package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/baskets")
public class CartController {
    @GetMapping
    public String list(
            @RequestAttribute String userId
    ) {
        return userId + "의 장바구니 목록";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestAttribute String userId,
            @RequestBody String basketDTO
    ){
        return userId + "의 장바구니 목록에 다음을 추가\n" + basketDTO;
    }

    @DeleteMapping("/{baskets_id}")
    public String delete(
            @PathVariable String baskets_id,
            @RequestAttribute String userId
    ) {
        return userId + "의 장바구니 목록에서 " + baskets_id + "를 삭제";
    }


}
