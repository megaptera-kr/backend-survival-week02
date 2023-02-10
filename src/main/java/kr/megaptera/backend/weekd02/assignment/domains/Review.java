package kr.megaptera.backend.weekd02.assignment.domains;

public class Review {
  private final Long id;
  private final Long productId;
  private final Long userId;
  private final String comments;

  public Review(Long id, Long productId, Long userId, String comments) {
    this.id = id;
    this.productId = productId;
    this.userId = userId;
    this.comments = comments;
  }

  public Long getId() {
    return id;
  }

  public Long getProductId() {
    return productId;
  }

  public Long getUserId() {
    return userId;
  }

  public String getComments() {
    return comments;
  }
}
