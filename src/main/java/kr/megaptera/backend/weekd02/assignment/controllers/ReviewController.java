package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @PostMapping("/{orderNo}")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@PathVariable String orderNo,
                         @RequestBody String reviewDto) {
        return "주문번호 " + orderNo + "에 대한 리뷰 작성 " + reviewDto + "\n";
    }

    @PatchMapping("/{id}")
    public String update(@PathVariable String id) {
        return "리뷰 수정 " + id + "\n";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        return "리뷰 삭제 " + id + "\n";
    }
}
