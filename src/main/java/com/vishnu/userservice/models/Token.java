package com.vishnu.userservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity(name="Tokens")
public class Token extends BaseModel{
    private String name;
    private Date expiryDate;

    @ManyToOne
    private User user;
}
