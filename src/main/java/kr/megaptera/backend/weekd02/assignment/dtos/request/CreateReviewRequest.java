package kr.megaptera.backend.weekd02.assignment.dtos.request;

public class CreateReviewRequest {
  private String comments;

  public CreateReviewRequest() {
  }

  public CreateReviewRequest(String comments) {
    this.comments = comments;
  }

  public String getComments() {
    return comments;
  }
}
