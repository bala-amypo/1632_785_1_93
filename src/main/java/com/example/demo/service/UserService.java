// package com.example.demo.service;

// import com.example.demo.model.User;

// public interface UserService {
//     User register(User user); 
//     User findByEmail(String email);
// }


// package com.example.demo.service;

// import com.example.demo.model.User;

// public interface UserService {
//     User register(User user);
//     User findByEmail(String email);
//     User findById(Long id);
// }


package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    // This constructor ensures the repository is injected by Spring
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}