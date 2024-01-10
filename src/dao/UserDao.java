package dao;

import models.User;

public interface UserDao {
    boolean save (User user);
    User getById (Long id);
    boolean update (User user);
    boolean delete (Long id);
}
