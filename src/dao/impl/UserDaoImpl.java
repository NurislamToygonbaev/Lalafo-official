package dao.impl;

import dao.UserDao;
import models.User;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
