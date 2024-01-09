package db;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<User> userArrayList = new ArrayList<>();

    public List<User> getAll (){
        return userArrayList;
    }

    public Boolean delete(User user){
        return userArrayList.remove(user);
    }

    public Boolean save(User user){
        return userArrayList.add(user);
    }
}
