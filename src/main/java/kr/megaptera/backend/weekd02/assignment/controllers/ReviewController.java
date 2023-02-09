package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/yhjs1211/products/{product_id}/reviews")
public class ReviewController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String commentReview(
            @PathVariable String product_id,
            @RequestAttribute("userId") String userId,
            @RequestBody String content
    ) {
        String msg = product_id + "에" + userId + "가 리뷰 등록 완료\n";
        return msg;
    }

    @PatchMapping("/{re_id}")
    @ResponseStatus(HttpStatus.OK)
    public String updateReview(
            @PathVariable String product_id,
            @PathVariable String re_id,
            @RequestAttribute("userId") String userId,
            @RequestBody String update
    ) {
        String msg = "상품명 : " + product_id + "\n" +
                "변경 내용 : " + update + "\n" +
                "유저 : " + userId + "\n" +
                "리뷰 번호 : " + re_id + "\n";
        return msg;
    }

    @DeleteMapping("/{re_id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteReview(
            @PathVariable String product_id,
            @PathVariable String re_id,
            @RequestAttribute("userId") String userId
    ) {
        String msg = "상품명 : " + product_id + "에 유저 " + userId + "가 작성한 리뷰(리뷰번호 : " + re_id + ")가 삭제되었습니다.\n";
        return msg;
    }
}
