package com.digipay.repository.impl;

import com.digipay.model.entity.User;
import com.digipay.repository.UserRepository;
import com.digipay.util.Util;
import jakarta.persistence.EntityManager;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    public void saveUser(User user) {
        EntityManager entityManager = Util.getEntityMangerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void updateUser(Long id, String name) {
        EntityManager entityManager = Util.getEntityMangerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.find(User.class, id).setUsername(name);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void removeUser(Long id) {
        EntityManager entityManager = Util.getEntityMangerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<User> readUser() {
        EntityManager entityManager = Util.getEntityMangerFactory().createEntityManager();
        return entityManager.createQuery("select t from User t",User.class).getResultList();
    }

    @Override
    public User getUserByNid(String nid){
        EntityManager entityManager = Util.getEntityMangerFactory().createEntityManager();
        return entityManager.createQuery("select n from User n where n.nationalCode IN (:nationalCode)", User.class)
                .setParameter("nationalCode", nid).getSingleResult();
    }

}
