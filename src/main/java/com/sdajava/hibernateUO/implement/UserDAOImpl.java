package main.java.com.sdajava.hibernateUO.implement;

import main.java.com.sdajava.hibernateUO.interfaces.UserDAO;
import main.java.com.sdajava.hibernateUO.model.User;
import main.java.com.sdajava.hibernateUO.utility.HibernateUtility;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    Session session = HibernateUtility.getHibernateSession();

    @Override
    public User insertUser(User u) {
        try{
            System.out.println(u.getFirstName()
                    + " " + u.getLastName());
            session.beginTransaction();
            session.persist(u);
            session.getTransaction().commit();
        }
        catch (HibernateException e) {
            if (session.getTransaction()!=null) session.getTransaction().rollback();
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void updateUser(int id, String name, String surname) {

    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public User findUser(int id) {
        return null;
    }
    /*@Override
    public List<User> getAllUsers() {
        List<User> users=null;
        try{

            session.beginTransaction();
            users = session.createQuery("FROM User").list();
            for (Iterator<User> iterator =
                 users.iterator(); iterator.hasNext();){
                User user = (User) iterator.next();
                System.out.print(" " + user.getName()+"\t");
                System.out.print("  " + user.getSurname()+"\n");
            }
        }
        catch (HibernateException e) {
            if (session.getTransaction()!=null) session.getTransaction().rollback();
            e.printStackTrace();
        }
        return users;
    }
    @Override
    public void updateUser(int id, String name,String surname){
        try{
            session.beginTransaction();
            User user = session.get(User.class, id);
            System.out.println(" "+user.getName());
            user.setName(name);
            user.setSurname(surname);
            session.update(user);
            session.getTransaction().commit();
        }
        catch (HibernateException e) {
            if (session.getTransaction()!=null) session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
    @Override
    public void removeUser(int id) {
        try{
            User user = session.get(User.class, id);
            System.out.println("  "+user.getName()+"  "+user.getSurname());
            session.delete(user);
            session.getTransaction().commit();
        }
        catch (HibernateException e) {
            if (session.getTransaction()!=null) session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
    @Override
    public User findUser(int id) {
        User user=session.get(User.class, id);
        System.out.println(" "+user.getName()+"  "+user.getSurname());
        return user;
    }*/
}
