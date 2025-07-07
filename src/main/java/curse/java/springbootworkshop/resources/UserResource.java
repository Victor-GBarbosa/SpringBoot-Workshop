package curse.java.springbootworkshop.resources;

import curse.java.springbootworkshop.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll () {
        User user = new User(1L, "Matheus", "matheus@gmail.com", "(xx) x xxxx-xxxx", "123456");
        return ResponseEntity.ok().body(user);
    }
}
