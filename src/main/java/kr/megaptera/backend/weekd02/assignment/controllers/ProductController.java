package kr.megaptera.backend.weekd02.assignment.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestBody String body
    ) {
        return "{\"action\" : \"상품 등록\", \"body\" : \"" + body.replace("\"", "\\\"") + "\"}";
    }

    @GetMapping
    public String getList(){
        
        return "상품 목록";
    }

    @GetMapping("/{id}")
    public String getDetail(
            @PathVariable String id
    ){
        return "상품 상세\n" + id;
    }


}
