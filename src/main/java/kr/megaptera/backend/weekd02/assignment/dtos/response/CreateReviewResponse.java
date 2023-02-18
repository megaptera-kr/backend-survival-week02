package kr.megaptera.backend.weekd02.assignment.dtos.response;

import kr.megaptera.backend.weekd02.assignment.domains.Review;

public class CreateReviewResponse {
  private final Review review;

  public CreateReviewResponse(Review review) {
    this.review = review;
  }

  public Review getReview() {
    return review;
  }
}
