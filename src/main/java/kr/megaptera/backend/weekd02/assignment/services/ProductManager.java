package kr.megaptera.backend.weekd02.assignment.services;

import kr.megaptera.backend.weekd02.assignment.models.AddProductRequest;
import kr.megaptera.backend.weekd02.assignment.models.Product;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProductManager {
    private long idCounter;
    private Map<Long, Product> products;

    public ProductManager() {
        idCounter = 0;
        products = new HashMap<>();
    }

    public boolean isExist(long id) {
        var product = products.get(id);
        return product != null;
    }

    public Product[] getAll(){
        var values =  products.values();
        return values.toArray(new Product[values.size()]);
    }

    public Product get(long id){
        var product =  products.get(id);
        return product;
    }

    public void add(AddProductRequest request) {
        var product = new Product();
        product.setId(++idCounter);
        product.setContent(request.getContent());

        products.put(product.getId(), product);
    }

    public void update(Product product){
        products.replace(product.getId(), product);
    }

    public void remove(long id){
        products.remove(id);
    }
}
