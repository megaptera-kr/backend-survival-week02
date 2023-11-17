package kr.megaptera.backend.weekd02.assignment.controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @PostMapping()
    public String create(
            @RequestBody String cartDTO,
            @RequestBody String userId
    ) {
        return "create";
    }

    @PutMapping("{cartId}")
    public String update(
            @PathVariable String cartId,
            @RequestAttribute String userId,
            @RequestBody String title,
            @RequestBody String content
    ) {
        System.out.println("userId : " + userId);
        System.out.println("cartId : " + cartId);
        System.out.println("title : " + title);
        System.out.println("content : " + content);
        return "update";
    }

    @DeleteMapping("{cartId}")
    public String delete(
            @RequestAttribute String userId,
            @PathVariable String cartId
    ) {
        System.out.println("userId : " + userId);
        System.out.println("삭제하기 : " + cartId);
        return "delete";
    }
}
