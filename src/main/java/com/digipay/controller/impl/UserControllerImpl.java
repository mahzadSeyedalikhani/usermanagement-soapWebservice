package com.digipay.controller.impl;

import com.digipay.controller.UserController;
import com.digipay.model.entity.User;
import com.digipay.service.UserService;
import com.digipay.util.Context;
import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "com.digipay.controller.UserController")
public class UserControllerImpl implements UserController {

    private final UserService userService;

    public UserControllerImpl() {
        this.userService = Context.getUserService();
    }


    @Override
    public void saveUserInfo(String username, String nationalCode, String[] roleId) {
        userService.createUser(username, nationalCode, roleId);
    }

    @Override
    public List<User> displayUser() {
        return userService.displayUser();
    }

    @Override
    public void updateUser(Long id, String name) {
        userService.updateUser(id, name);
    }

    @Override
    public void removeUser(Long id) {
        userService.removeUser(id);
    }

    @Override
    public User getUserByNid(String nid) {
        return userService.getUserByNid(nid);
    }


}
