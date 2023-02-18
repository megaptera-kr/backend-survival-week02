package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    private static final List<String> itemList = new ArrayList<>();
    @PostMapping("/items")
    @ResponseStatus(HttpStatus.OK)
    public String addCart(@RequestParam String itemName){
        itemList.add(itemName);
        return "장바구니에 상품 추가\n 추가된 상품 : " + itemName;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getItemList(){
        String message = "장바구니 (담긴 상품 목록) 조회\n";
        message += String.join("\n", itemList);
        return message;
    }

    @DeleteMapping("/items/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String removeItem(@PathVariable int id){
        if (itemList.size() == 0) {
            return "장바구니가 비어 있습니다.";
        }

        String message = "장바구니에 상품 삭제\n 제거된 상품번호 : " + id + " 상품명 : " +itemList.get(id);
        itemList.remove(id);

        return message;
    }
}
