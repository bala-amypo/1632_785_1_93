// package com.example.demo.service.impl;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.demo.model.User;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.service.UserService;

// @Service
// public class UserServiceImpl implements UserService {

//     @Autowired
//     private UserRepository userRepository;

//     @Override
//     public User registerUser(User user) {

        
//         if (user.getRole() == null) {
//             user.setRole("USER");
//         }

//         return userRepository.save(user);
//     }

//     @Override
//     public User findByEmail(String email) {
//         return userRepository.findByEmail(email);
//     }
// }





// package com.example.demo.service.impl;

// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.demo.model.User;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.service.UserService;

// @Service
// public class UserServiceImpl implements UserService {

//     @Autowired
//     private UserRepository userRepository;

//     // Method name MUST match interface + tests
//     @Override
//     public User register(User user) {

//         // Default role logic (required by tests)
//         if (user.getRole() == null) {
//             user.setRole("USER");
//         }

//         return userRepository.save(user);
//     }

//     @Override
//     public User findByEmail(String email) {

//         Optional<User> userOpt = userRepository.findByEmail(email);

//         if (userOpt.isPresent()) {
//             return userOpt.get();
//         }

//         throw new RuntimeException("User not found");
//     }
// }


package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        if (user.getRole() == null) {
            user.setRole("USER");
        }
        return userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
