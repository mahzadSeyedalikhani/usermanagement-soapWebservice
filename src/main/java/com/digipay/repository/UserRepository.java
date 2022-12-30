package com.digipay.repository;

import com.digipay.model.entity.User;

import java.util.List;

public interface UserRepository {
    void saveUser(User user);
    void updateUser(Long id, String name);
    void removeUser(Long id);
    List<User> readUser();

    User getUserByNid(String nid);
}
