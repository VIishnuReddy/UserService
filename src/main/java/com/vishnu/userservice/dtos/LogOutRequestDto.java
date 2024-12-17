package com.vishnu.userservice.dtos;

import com.vishnu.userservice.models.Token;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogOutRequestDto {
    private Token token;
}
