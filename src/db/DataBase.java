package db;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private final List<User> users = new ArrayList<>();

    public List<User> getAll (){
        return users;
    }
    public boolean save (User user){
        return users.add(user);
    }

    public boolean remove (User user){
        return users.remove(user);
    }
}
