package com.digipay.service;

import com.digipay.model.entity.Role;

import java.util.List;

public interface RoleService {
    void saveUserRole(String roleTitle, String[] permissionId);
    List<Role> displayUserRole();
    void updateUserRole(Long id, String name);
    void removeUserRole(Long id);
}
