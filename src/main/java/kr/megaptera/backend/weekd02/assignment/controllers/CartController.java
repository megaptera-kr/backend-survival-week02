package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/baskets")
public class CartController {

    @GetMapping
    public String list(@RequestAttribute String userId) {
        //list(userId);
        return "내 장바구니 상품 목록 조회";
    }

    @PostMapping("/goods/{good_id}")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@PathVariable String good_id,
                         @RequestAttribute String userId) {
        //create(userId,good_id);
        return userId + "의 장바구니에 " + good_id + " 상품 추가 \n ";
    }

    @DeleteMapping("/goods/{good_id}")
    public String delete(@PathVariable String good_id,
                         @RequestAttribute String userId) {
        //delete(userId, good_id) 아이디에서 상품삭제
        return good_id + "상품 삭제 되었습니다.";
    }
}
