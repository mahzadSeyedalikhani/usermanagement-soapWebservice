package com.digipay.controller.impl;

import com.digipay.controller.RoleController;
import com.digipay.model.entity.Role;
import com.digipay.service.RoleService;
import com.digipay.util.Context;
import jakarta.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.digipay.controller.RoleController")
public class RoleControllerImpl implements RoleController {

    private final RoleService roleService;

    public RoleControllerImpl(){
        this.roleService = Context.getRoleService();
    }
    @Override
    public void saveRoleInfo(String roleTitle, String[] permissionId) {
        roleService.saveUserRole(roleTitle, permissionId);
    }

    @Override
    public List<Role> displayUserRole() {
        return roleService.displayUserRole();
    }

    @Override
    public void updateUserRole(Long id, String name) {
        roleService.updateUserRole(id, name);
    }

    @Override
    public void removeUserRole(Long id) {
        roleService.removeUserRole(id);
    }
}
