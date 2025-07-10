package curse.java.springbootworkshop.repositories;

import curse.java.springbootworkshop.entities.Category;
import curse.java.springbootworkshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
