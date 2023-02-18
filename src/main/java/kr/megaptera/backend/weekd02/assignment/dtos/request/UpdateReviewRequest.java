package kr.megaptera.backend.weekd02.assignment.dtos.request;

public class UpdateReviewRequest {
  private String comments;

  public UpdateReviewRequest() {
  }

  public UpdateReviewRequest(String comments) {
    this.comments = comments;
  }

  public String getComments() {
    return comments;
  }
}
