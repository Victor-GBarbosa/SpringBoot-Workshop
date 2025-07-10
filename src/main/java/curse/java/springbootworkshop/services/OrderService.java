package curse.java.springbootworkshop.services;

import curse.java.springbootworkshop.entities.Order;
import curse.java.springbootworkshop.repositories.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional
    public List<Order> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
