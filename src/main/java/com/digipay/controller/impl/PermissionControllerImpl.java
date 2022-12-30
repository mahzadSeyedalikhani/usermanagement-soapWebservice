package com.digipay.controller.impl;

import com.digipay.controller.PermissionController;
import com.digipay.model.entity.Permission;
import com.digipay.service.PermissionService;
import com.digipay.util.Context;
import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "com.digipay.controller.PermissionController")
public class PermissionControllerImpl implements PermissionController {

    private final PermissionService permissionService;

    public PermissionControllerImpl(){
        this.permissionService = Context.getPermissionService();
    }
    @Override
    public void savePermissionInfo(String title) {
        permissionService.createPermission(title);
    }

    @Override
    public List<Permission> displayPermission() {
        return permissionService.displayPermission();
    }

    @Override
    public void updatePermission(Long id, String name) {
        permissionService.updatePermission(id, name);
    }

    @Override
    public void removePermission(Long id) {
        permissionService.removePermission(id);
    }
}
