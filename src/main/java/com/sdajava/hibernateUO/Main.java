package main.java.com.sdajava.hibernateUO;

import main.java.com.sdajava.hibernateUO.implement.UserDAOImpl;
import main.java.com.sdajava.hibernateUO.model.User;

public class Main {

    public static void main(String[] args) {
        UserDAOImpl userDAOImpl=new UserDAOImpl();
        User user =new User();
        user.setFirstName("jan");
        user.setLastName("kowalski");

        User user1 =new User();
        user1.setFirstName("andrzej");
        user1.setLastName("kowalski");

        userDAOImpl.insertUser(user);
        userDAOImpl.insertUser(user1);
        //userDAOImpl.getAllUsers();
    }
}
