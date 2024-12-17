package com.vishnu.userservice.controllers;


import com.vishnu.userservice.dtos.LoginRequestDto;
import com.vishnu.userservice.dtos.SignUpRequestDto;
import com.vishnu.userservice.dtos.UserDto;
import com.vishnu.userservice.models.Token;
import com.vishnu.userservice.models.User;
import com.vishnu.userservice.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
   public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public Token logIn(@RequestBody LoginRequestDto loginRequestDto){

        return null;
    }

    @PostMapping("/signup")
    public UserDto signUp(@RequestBody SignUpRequestDto signUpRequestDto){
        User user= userService.signUp(
                signUpRequestDto.getName(),
                signUpRequestDto.getEmail(),
                signUpRequestDto.getPassword()

        );
       return  UserDto.from(user);
    }

    @GetMapping("/logout")
    public ResponseEntity<Void> logOut(LoginRequestDto loginRequestDto){
        return null;
    }

    @GetMapping("/validate")
    public UserDto validateToken(String token){
    return null;
    }
}
