package ma.ens.springdocker.controller;

import ma.ens.springdocker.entity.User;
import ma.ens.springdocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String hello() {
        return "Application Spring Boot fonctionne correctement dans Docker!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}

