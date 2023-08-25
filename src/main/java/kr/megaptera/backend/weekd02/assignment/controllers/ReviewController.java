package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/{productid}/reviews")
public class ReviewController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody String reviewDTO) {
        return "{\"action\" : \"리뷰 등록\", \"body\" : \"" + reviewDTO.replace("\"", "\\\"") + "\"}";
    }

    @GetMapping
    public String getList(@PathVariable String productid){

        return productid + "상품의 리뷰 목록" + "\n";
    }

    @GetMapping("/{reviewid}")
    public String getDetail(
            @PathVariable String productid,
            @PathVariable String reviewid
    ){

        return productid + "상품의 " + reviewid + "리뷰 상세";
    }

    @PatchMapping("/{reviewid}")
    public String update(
            @PathVariable("reviewid") String reviewid,
            @RequestBody String body
    ){
        return reviewid + "리뷰 수정\n" + body;
    }

    @DeleteMapping("/{reviewid}")
    public String delete(
            @PathVariable("reviewid") String reviewid
    ){
        return reviewid + "리뷰 삭제\n";
    }

}
