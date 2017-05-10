package main.java.com.sdajava.hibernateUO.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    //id, id_uzytkownika, lista artykułów, data zamówienia
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int orderId;

    //private int userIdFk;
    //private List<Product> productList;

    @ManyToOne
    @JoinColumn(name="user_id",
                referencedColumnName = "user_id",
                nullable=false)
    private User user_id;

    public Order(int orderId, int userIdFk, User user) {
        this.orderId = orderId;
       // this.userIdFk = userIdFk;
        this.user_id = user;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

   /* public int getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(int userIdFk) {
        this.userIdFk = userIdFk;
    }
*/
    //public List<Product> getProductList() {
        //return productList;
    //}

   // public void setProductList(List<Product> productList) {
    //    this.productList = productList;
   // }
}
