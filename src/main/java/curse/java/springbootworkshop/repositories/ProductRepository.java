package curse.java.springbootworkshop.repositories;

import curse.java.springbootworkshop.entities.Category;
import curse.java.springbootworkshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
