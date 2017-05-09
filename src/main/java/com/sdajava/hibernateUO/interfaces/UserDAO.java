package main.java.com.sdajava.hibernateUO.interfaces;

import main.java.com.sdajava.hibernateUO.model.User;

import java.util.List;

public interface UserDAO {
	public User insertUser(User u);

	public List<User> getAllUsers();

	public void updateUser(int id, String name, String surname);

	public void removeUser(int id);

	public User findUser(int id);

}
