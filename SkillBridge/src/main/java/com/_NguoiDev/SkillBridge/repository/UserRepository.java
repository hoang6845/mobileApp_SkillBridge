package com._NguoiDev.SkillBridge.repository;

import com._NguoiDev.SkillBridge.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    public boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);
}
