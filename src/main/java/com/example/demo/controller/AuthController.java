// package com.example.demo.controller;

// import com.example.demo.dto.LoginRequest;
// import com.example.demo.dto.RegisterRequest;
// import com.example.demo.model.User;
// import com.example.demo.service.UserService;
// import com.example.demo.util.JwtUtil;
// import io.swagger.v3.oas.annotations.Operation;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.web.bind.annotation.*;

// import java.util.HashMap;
// import java.util.Map;

// @RestController
// @RequestMapping("/auth")
// @Tag(name = "Auth", description = "User Registration and Authentication")
// public class AuthController {

//     private final UserService userService;
//     private final PasswordEncoder passwordEncoder;
//     private final JwtUtil jwtUtil;

   
//     public AuthController(UserService userService, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
//         this.userService = userService;
//         this.passwordEncoder = passwordEncoder;
//         this.jwtUtil = jwtUtil;
//     }

//     @PostMapping("/register")
//     @Operation(summary = "Register a new user")
//     public ResponseEntity<User> register(@RequestBody RegisterRequest request) {
//         User user = new User();
//         user.setName(request.getName());
//         user.setEmail(request.getEmail());
//         user.setPassword(request.getPassword());
//         user.setRole(request.getRole());
//         return ResponseEntity.ok(userService.register(user));
//     }

//     @PostMapping("/login")
//     @Operation(summary = "Authenticate user and return JWT")
//     public ResponseEntity<?> login(@RequestBody LoginRequest request) {
//         User user = userService.findByEmail(request.getEmail());
        
//         if (passwordEncoder.matches(request.getPassword(), user.getPassword())) {
//             String token = jwtUtil.generateToken(user.getEmail(), user.getId(), user.getRole());
//             Map<String, String> response = new HashMap<>();
//             response.put("token", token);
//             response.put("email", user.getEmail());
//             response.put("role", user.getRole());
//             return ResponseEntity.ok(response);
//         }
        
//         return ResponseEntity.status(401).body("Invalid credentials");
//     }
// }



package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html").permitAll()
                .requestMatchers("/auth/**").permitAll() 
                .anyRequest().authenticated()
            );
        
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Add this to prevent 500 errors during authentication setup
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
}