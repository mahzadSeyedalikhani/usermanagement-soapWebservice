package com.digipay.repository;

import com.digipay.model.entity.Role;

import java.util.List;

public interface RoleRepository {
    void saveUserRole(Role role);
    void updateUserRole(Long id, String name);
    public void removeUserRole(Long id);
    public List<Role> readUserRole();
    Role findRoleById(Long id);
}
