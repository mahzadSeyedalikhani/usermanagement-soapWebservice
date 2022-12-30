package com.digipay.service;

import com.digipay.model.entity.User;

import java.util.List;

public interface UserService {
    void createUser(String name, String nationalCode, String[] roleId);
    List<User> displayUser();
    void updateUser(Long id, String name);
    void removeUser(Long id);

    User getUserByNid(String nid);
}
