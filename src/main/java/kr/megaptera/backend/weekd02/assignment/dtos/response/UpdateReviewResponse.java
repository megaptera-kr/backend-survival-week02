package kr.megaptera.backend.weekd02.assignment.dtos.response;

import kr.megaptera.backend.weekd02.assignment.domains.Review;

public class UpdateReviewResponse {
  private final Review review;

  public UpdateReviewResponse(Review review) {
    this.review = review;
  }

  public Review getReview() {
    return review;
  }
}
