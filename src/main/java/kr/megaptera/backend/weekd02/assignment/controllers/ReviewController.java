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

/**
 * @ResponseStatus(HttpStatus.CREATED) - HTTP 요청에 대한 응답 상태 코드를 설정하는 데 사용
 *
 * HTTP 요청에서 값을 추출하여 컨트롤러 메소드에서 사용할 수 있도록 합니다
 * @RequestAttribute - HTTP 요청의 헤더나 URL 쿼리 매개변수와 같은 요청 매개변수에서 값을 추출
 * @RequestBody - URL 쿼리 매개변수에서만 값을 추출
 *
 * @PathVariable - RESTful API에서 URL 경로의 일부를 변수로 사용하는 데 사용
 * **/

@RestController
@RequestMapping("products/{productId}/reviews")
public class ReviewController {
    @GetMapping
    public String list(@PathVariable String productId) {
        return "리뷰 목록: " + productId + "\n";
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @PathVariable String productId,
            @RequestBody String reviewDto,
            @RequestAttribute String userId
    ) {
        return "상품에 리뷰 작성: " + reviewDto + "\n";
    }

    @PatchMapping("{id}")
    public String update(
            @PathVariable String productId,
            @PathVariable String id,
            @RequestBody String reviewDto,
            @RequestAttribute String userId
    ) {

        return "상품에 리뷰 수정: " + reviewDto + "\n";
    }

    @DeleteMapping("{id}")
    public String delete(
            @PathVariable String productId,
            @PathVariable String id,
            @RequestAttribute String userId
    ) {

        return "상품에 리뷰 삭제: " + id + "\n";
    }
}

