package com.digipay.repository.impl;

import com.digipay.model.entity.Role;
import com.digipay.repository.RoleRepository;
import com.digipay.util.Util;
import jakarta.persistence.EntityManager;

import java.util.List;

public class RoleRepositoryImpl implements RoleRepository {
    public void saveUserRole(Role role) {
        EntityManager entityManager = Util.getEntityMangerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(role);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void updateUserRole(Long id, String name) {
        EntityManager entityManager = Util.getEntityMangerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.find(Role.class, id).setTitle(name);
        entityManager.getTransaction().commit();
    }

    @Override
    public void removeUserRole(Long id) {
        EntityManager entityManager = Util.getEntityMangerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Role role = entityManager.find(Role.class, id);
        entityManager.remove(role);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Role> readUserRole() {
        EntityManager entityManager = Util.getEntityMangerFactory().createEntityManager();
        return entityManager.createQuery("select t from Role t", Role.class).getResultList();
    }

    @Override
    public Role findRoleById(Long id) {
        EntityManager entityManager = Util.getEntityMangerFactory().createEntityManager();
        return entityManager.find(Role.class,id);
    }
}
