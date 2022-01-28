package com.example.jwt.Repositories;

import com.example.jwt.model.Role;
import com.example.jwt.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepo   extends JpaRepository<Role,Long> {
    Optional<Role> findByName(RoleName roleName);


}
