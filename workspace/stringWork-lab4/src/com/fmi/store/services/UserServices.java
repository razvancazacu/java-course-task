package com.fmi.store.services;
import com.fmi.store.model.User;

public class UserServices {
    private static User[] listOfUsers = new User[4];

    private static UserServices ourInstance = new UserServices();

    public static UserServices getInstance() {
        return ourInstance;
    }

    private UserServices() {
        //  Private constructor
        listOfUsers[0] = new User(1,"Ioana","password");
        listOfUsers[1] = new User(2,"Adelin","password");
        listOfUsers[2] = new User(3,"Marcu","password");
        listOfUsers[3] = new User(4,"Doru","password");
    }
    public User getOne(Integer id){
        /* TODO implement - to find user by id */
        return listOfUsers[id];
    }
    public User getOne(String username){
        /* TODO implement - to find user by username */
        for (User user:
             listOfUsers) {
            if(username == user.getUsername()){
                return user;
            }
        }
    }
}
