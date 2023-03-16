package kr.megaptera.backend.weekd02.assignment.controllers;

import kr.megaptera.backend.weekd02.assignment.exceptions.NotFoundException;
import kr.megaptera.backend.weekd02.assignment.models.AddProductRequest;
import kr.megaptera.backend.weekd02.assignment.models.Product;
import kr.megaptera.backend.weekd02.assignment.services.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductManager productManager;

    @Autowired
    public ProductController(ProductManager productManager) {
        this.productManager = productManager;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Product[] getAll(){
        return productManager.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product get(@PathVariable long id) throws NotFoundException {

        if(!productManager.isExist(id)){
            throw new NotFoundException();
        }

        return productManager.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody AddProductRequest request) {
        productManager.add(request);
    }

    @PatchMapping
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Product request) throws NotFoundException {

        if(!productManager.isExist(request.getId())){
            throw new NotFoundException();
        }

        productManager.update(request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void remove(@PathVariable long id) throws NotFoundException {

        if(!productManager.isExist(id)){
            throw new NotFoundException();
        }

        productManager.remove(id);
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void postNotFound(){
    }
}
