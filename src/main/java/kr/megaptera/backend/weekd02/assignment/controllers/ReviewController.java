package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.dto.ReviewRequestDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
  @PostMapping
  public String writeReview(@RequestBody ReviewRequestDto reviewRequestDto) {
    return String.format("다음 리뷰 정보(%s)가 등록되었습니다.", reviewRequestDto);
  }

  @PutMapping("/{id}")
  public String editReview(@PathVariable Long id, @RequestBody ReviewRequestDto reviewRequestDto) {
    return String.format("리뷰번호 %d번의 댓글이 다음과 같이 수정되었습니다.(%s)", id, reviewRequestDto);
  }

  @DeleteMapping("/{id}")
  public String removeReview(@PathVariable Long id) {
    return String.format("리뷰번호 %d번의 댓글이 삭제되었습니다.", id);
  }

}
