package com.digipay.repository;

import com.digipay.model.entity.Permission;

import java.util.List;

public interface PermissionRepository {
    void saveRolePermission(Permission permission);
    void updateRolePermission(Long id, String name);
    void removeRolePermission(Long id);
    List<Permission> readRolePermissions();
    Permission findPermissionById(Long id);
}
