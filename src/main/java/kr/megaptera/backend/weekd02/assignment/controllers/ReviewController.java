package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.domains.Review;
import kr.megaptera.backend.weekd02.assignment.dtos.request.CreateReviewRequest;
import kr.megaptera.backend.weekd02.assignment.dtos.request.UpdateReviewRequest;
import kr.megaptera.backend.weekd02.assignment.dtos.response.CreateReviewResponse;
import kr.megaptera.backend.weekd02.assignment.dtos.response.DeleteReviewResponse;
import kr.megaptera.backend.weekd02.assignment.dtos.response.UpdateReviewResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/{productId}/reviews")
public class ReviewController {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public CreateReviewResponse createReview(@PathVariable Long productId,
      @RequestAttribute Long userId, @RequestBody CreateReviewRequest request) {
    Review review = new Review(1L, productId, userId, request.getComments());

    return new CreateReviewResponse(review);
  }

  @PatchMapping("/{reviewId}")
  public UpdateReviewResponse updateReview(@PathVariable Long productId,
      @PathVariable Long reviewId, @RequestAttribute Long userId,
      @RequestBody UpdateReviewRequest request) {
    Review review = new Review(reviewId, productId, userId, request.getComments());

    return new UpdateReviewResponse(review);
  }

  @DeleteMapping("/{reviewId}")
  public DeleteReviewResponse deleteReview(@PathVariable Long productId,
      @PathVariable Long reviewId, @RequestAttribute Long userId) {

    return new DeleteReviewResponse(productId, reviewId);
  }
}
