package curse.java.springbootworkshop.config;

import curse.java.springbootworkshop.entities.Order;
import curse.java.springbootworkshop.entities.User;
import curse.java.springbootworkshop.entities.enums.OrderStatus;
import curse.java.springbootworkshop.repositories.OrderRepository;
import curse.java.springbootworkshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

       User newUser1 = new User("Dom pedro I da silva", "pedrinhocraftevil@gmail.com", "(11) 998610-6166", "senha123");
       User newUser2 = new User("Claudio da silva", "claudio@gmail.com", "(62) 99903-9040", "jimin<3");
       User newUser3 = new User("Enzo Henrique", "enrenzo@pronton.ru", "(11) 98002-8922", "senhaInraquiavel");
       userRepository.saveAll(Arrays.asList(newUser1, newUser2, newUser3));

       Order order1 = new Order(newUser1, Instant.now(), OrderStatus.DELIVERED);
       Order order1_1 = new Order(newUser1, Instant.ofEpochSecond(1752349162), OrderStatus.WAINTING_PAYMENT);
       Order order1_2 = new Order(newUser1, Instant.ofEpochSecond(1746633131), OrderStatus.SHIPPED);
       Order order2 = new Order(newUser2, Instant.now(), OrderStatus.PAID);
       Order order3 = new Order(newUser3, Instant.now(), OrderStatus.CANCELED);
       orderRepository.saveAll(Arrays.asList(order1, order1_1, order1_2, order2, order3));
    }
}
