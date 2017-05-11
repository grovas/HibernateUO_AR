package main.java.com.sdajava.hibernateUO.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
    //id, imie, nazwisko, adres)
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "user_id")
    private int user_id;
    private String firstName;
    private String lastName;
    private String address;

    @OneToMany(mappedBy ="user")
    private Set<Order> order;

    public User(){}

    public User(int userId, String firstName, String lastName, String address) {
        this.user_id = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int userId) {
        this.user_id = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
