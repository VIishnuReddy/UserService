package com.vishnu.userservice.repositories;

import com.vishnu.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User Save(User user);

    Optional<User> findByEmail(String email);
}
