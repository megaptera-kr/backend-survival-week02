package kr.megaptera.backend.weekd02.assignment.dtos.response;

public class DeleteReviewResponse {
  private final Long productId;
  private final Long reviewId;

  public DeleteReviewResponse(Long productId, Long reviewId) {
    this.productId = productId;
    this.reviewId = reviewId;
  }

  public Long getProductId() {
    return productId;
  }

  public Long getReviewId() {
    return reviewId;
  }
}
