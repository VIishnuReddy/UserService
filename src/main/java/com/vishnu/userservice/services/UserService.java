package com.vishnu.userservice.services;

import com.vishnu.userservice.dtos.UserDto;
import com.vishnu.userservice.models.Token;
import com.vishnu.userservice.models.User;

public interface UserService {

    Token login(String email, String password);

    User signUp(String name, String password, String email);

    void logOut(String token);

    User validateToken(String token);
}
