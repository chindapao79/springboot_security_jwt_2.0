package com.api.springbootjwt.repository;

import java.util.Optional;

import com.api.springbootjwt.models.ERole;
import com.api.springbootjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}