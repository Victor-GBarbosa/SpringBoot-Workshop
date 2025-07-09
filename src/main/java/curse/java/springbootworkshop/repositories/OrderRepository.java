package curse.java.springbootworkshop.repositories;

import curse.java.springbootworkshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
