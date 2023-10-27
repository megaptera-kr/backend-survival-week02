package kr.megaptera.backend.weekd02.assignment;

public class Review {
    private String productId;
    private String userId;
    private String reviewDetail;

    public Review(String productId, String userId, String reviewDetail) {
        this.productId = productId;
        this.userId = userId;
        this.reviewDetail = reviewDetail;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReviewDetail() {
        return reviewDetail;
    }

    public void setReviewDetail(String reviewDetail) {
        this.reviewDetail = reviewDetail;
    }
}
