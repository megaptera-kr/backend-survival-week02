package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.config.message;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public String create(@RequestAttribute String userId, @RequestBody String createReviewDto) {
    return message.makeMassage("상품에 리뷰 작성", createReviewDto);
  }

  @PutMapping("/{id}")
  public String update(@PathVariable("id") String id, @RequestAttribute String userId,
      @RequestBody String updateReviewDto) {
    return message.makeMassage("상품에 리뷰 수정",updateReviewDto);
  }
  @DeleteMapping("/{id}")
  public String delete(@PathVariable("id")String id, @RequestAttribute String userId){
    return message.makeMassage("상품에 리뷰 삭제",id);
  }
}
