package com.charles.website.repository;

import com.charles.website.entity.Address;
import com.charles.website.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    User findByEmail(String email);

    User findByResetPasswordToken(String token);

    User findByRegisterToken(String token);

}

