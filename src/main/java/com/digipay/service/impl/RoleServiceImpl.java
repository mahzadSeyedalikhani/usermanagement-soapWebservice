package com.digipay.service.impl;

import com.digipay.model.entity.Permission;
import com.digipay.model.entity.Role;
import com.digipay.repository.PermissionRepository;
import com.digipay.repository.RoleRepository;
import com.digipay.service.RoleService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    private final PermissionRepository permissionRepository;

    public RoleServiceImpl(RoleRepository roleRepository, PermissionRepository permissionRepository) {
        this.roleRepository = roleRepository;
        this.permissionRepository = permissionRepository;
    }

    @Override
    public void saveUserRole(String roleTitle, String[] permissionId) {
        Role role = new Role();
        role.setTitle(roleTitle);
        Set<Permission> permissionSet = new HashSet<>();
        for(int index = 0 ; index<permissionId.length; index++){
            long id = Long.parseLong(permissionId[index]);
            Permission permission = permissionRepository.findPermissionById(id);
            permissionSet.add(permission);
        }
        role.setPermissions(permissionSet);
        roleRepository.saveUserRole(role);
        System.out.println("your role with required permission is created successfully :)");
    }

    @Override
    public List<Role> displayUserRole() {
        return roleRepository.readUserRole();
    }

    @Override
    public void updateUserRole(Long id, String name) {
        roleRepository.updateUserRole(id, name);
    }

    @Override
    public void removeUserRole(Long id) {
        roleRepository.removeUserRole(id);
    }
}
