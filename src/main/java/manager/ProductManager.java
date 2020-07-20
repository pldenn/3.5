package manager;

import repository.ProductRepository;
import ru.netology.domain.Product;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }
    public void add (Product product){
        repository.save(product);
    }

}
