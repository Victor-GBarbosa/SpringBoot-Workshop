package curse.java.springbootworkshop.repositories;

import curse.java.springbootworkshop.entities.Category;
import curse.java.springbootworkshop.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
