package com.digipay.service.impl;

import com.digipay.model.entity.Permission;
import com.digipay.repository.PermissionRepository;
import com.digipay.service.PermissionService;

import java.util.List;

public class PermissionServiceImpl implements PermissionService{
    private final PermissionRepository permissionRepository;

    public PermissionServiceImpl(PermissionRepository permissionRepository){
        this.permissionRepository = permissionRepository;
    }

    @Override
    public void createPermission(String title) {
        Permission permission = new Permission();
        permission.setTitle(title);
        permissionRepository.saveRolePermission(permission);
        System.out.println("your role with required permission is created successfully :)");
    }

    @Override
    public List<Permission> displayPermission() {
        return permissionRepository.readRolePermissions();
    }

    @Override
    public void updatePermission(Long id, String name) {
        permissionRepository.updateRolePermission(id, name);
    }

    @Override
    public void removePermission(Long id) {
        permissionRepository.removeRolePermission(id);
    }

}
