package kr.megaptera.backend.weekd02.assignment.dto;

public class ReviewRequestDto {
  private Long productId;
  private String title;
  private String content;

  @Override
  public String toString() {
    return "ReviewRequestDto{" +
      "productId=" + productId +
      ", title='" + title + '\'' +
      ", content='" + content + '\'' +
      '}';
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
