package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("orders")
public class OrderController {

    @GetMapping
    public String list(@RequestAttribute String userId) {
        return "주문 목록" + userId + "\n";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(
            @RequestAttribute String userId,
            @RequestBody String orderDto
    ) {
        return "주문하기" + orderDto + "\n";
    }

}
