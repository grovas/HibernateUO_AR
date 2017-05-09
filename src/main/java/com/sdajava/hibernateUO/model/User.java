package main.java.com.sdajava.hibernateUO.model;

import javax.persistence.*;

@Entity
public class User {
    //id, imie, nazwisko, adres)
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int userId;
    private String firstName;
    private String lastName;
    private String address;

    @OneToMany(mappedBy ="user")
    private Order order;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
