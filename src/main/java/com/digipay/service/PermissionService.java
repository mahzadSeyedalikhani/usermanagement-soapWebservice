package com.digipay.service;

import com.digipay.model.entity.Permission;

import java.util.List;

public interface PermissionService {
    void createPermission(String title);
    List<Permission> displayPermission();
    void updatePermission(Long id, String name);
    void removePermission(Long id);
}
