package main.java.com.sdajava.hibernateUO.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String city;

    @ManyToMany(mappedBy="address")
    private List<User> users = new ArrayList<User>();

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
