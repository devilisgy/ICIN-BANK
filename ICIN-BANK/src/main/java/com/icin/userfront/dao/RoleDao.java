package com.icin.userfront.dao;

import org.springframework.data.repository.CrudRepository;

import com.icin.userfront.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
