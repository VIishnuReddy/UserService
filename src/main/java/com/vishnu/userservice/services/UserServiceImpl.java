package com.vishnu.userservice.services;

import com.vishnu.userservice.models.Token;
import com.vishnu.userservice.models.User;
import com.vishnu.userservice.repositories.UserRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public UserServiceImpl(UserRepo userRepo, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepo = userRepo;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public Token login(String email, String password) {
        return null;
    }

    @Override
    public User signUp(String name, String password, String email) {
       Optional<User> optionalUser= userRepo.findByEmail(email);
       if(optionalUser.isPresent()) {
           // redirecting to login page

       }
           User user=new User();
           user.setName(name);
           user.setEmail(email);
           user.setPassword(bCryptPasswordEncoder.encode(password));

          return userRepo.save(user);
    }

    @Override
    public void logOut(String token) {

    }

    @Override
    public User validateToken(String token) {
        return null;
    }
}
