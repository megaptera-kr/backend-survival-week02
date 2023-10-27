package kr.megaptera.backend.weekd02.assignment;

public class Order {
    private int orderId;
    private Product[] products;


    public Order(int orderId, Product[] products) {
        this.orderId = orderId;
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
