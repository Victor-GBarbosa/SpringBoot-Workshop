package curse.java.springbootworkshop.config;

import curse.java.springbootworkshop.entities.User;
import curse.java.springbootworkshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

       User newUser1 = new User("Dom pedro I da silva", "pedrinhocraftevil@gmail.com", "(11) 998610-6166", "senha123");
       User newUser2 = new User("Claudio da silva", "claudio@gmail.com", "(62) 99903-9040", "jimin<3");
       User newUser3 = new User("Enzo Henrique", "enrenzo@pronton.ru", "(11) 98002-8922", "senhaInraquiavel");
       userRepository.saveAll(Arrays.asList(newUser1, newUser2, newUser3));
    }
}
