package kr.megaptera.backend.weekd02.assignment;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String productId;
    private String productDetail;
    private Map<String, Review[]> reviews = new HashMap<>();

    public Product(String productId, String productDetail) {
        this.productId = productId;
        this.productDetail = productDetail;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }
}
