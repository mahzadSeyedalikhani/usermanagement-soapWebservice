package com.digipay.util;

import com.digipay.repository.PermissionRepository;
import com.digipay.repository.RoleRepository;
import com.digipay.repository.UserRepository;
import com.digipay.repository.impl.PermissionRepositoryImpl;
import com.digipay.repository.impl.RoleRepositoryImpl;
import com.digipay.repository.impl.UserRepositoryImpl;
import com.digipay.service.PermissionService;
import com.digipay.service.RoleService;
import com.digipay.service.UserService;
import com.digipay.service.impl.PermissionServiceImpl;
import com.digipay.service.impl.RoleServiceImpl;
import com.digipay.service.impl.UserServiceImpl;

public class Context {
    private static final UserRepository userRepository;
    private static final RoleRepository roleRepository;
    private static final PermissionRepository permissionRepository;
    private static final UserService userService;
    private static final RoleService roleService;
    private static final PermissionService permissionService;


    static {
        userRepository = new UserRepositoryImpl();
        roleRepository = new RoleRepositoryImpl();
        permissionRepository = new PermissionRepositoryImpl();
        userService = new UserServiceImpl(userRepository, roleRepository);
        permissionService = new PermissionServiceImpl(permissionRepository);
        roleService = new RoleServiceImpl(roleRepository, permissionRepository);

    }

    public static UserRepository getUserRepository() {
        return userRepository;
    }

    public static UserService getUserService() {
        return userService;
    }

    public static RoleService getRoleService() {
        return roleService;
    }

    public static PermissionService getPermissionService() {
        return permissionService;
    }
}
