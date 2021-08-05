package expertostechdio.lombok.controller;


import expertostechdio.lombok.model.ProductModel;
import expertostechdio.lombok.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<ProductModel>> listAll() {
        return ResponseEntity.ok(productRepository.findAll());
    }

    @PostMapping("/saveProduct")
    public ResponseEntity<ProductModel> save(@RequestBody ProductModel productModel){
        return ResponseEntity.ok(productRepository.save(productModel));
    }

}
