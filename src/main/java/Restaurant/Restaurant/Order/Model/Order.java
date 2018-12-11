package Restaurant.Restaurant.Order.Model;

import Restaurant.Restaurant.Dish.Model.Dish;
import Restaurant.Restaurant.Restaurant.Model.Restaurant;
import Restaurant.Restaurant.User.Model.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Restaurant Restaurant;

    @OneToMany
    private Set<Dish> Dish;

    private float price;

    @ManyToOne
    private User User;

    public Order(){
    }

    public Order(Restaurant restaurant, float price,User user) {
        Restaurant = restaurant;
        this.price = price;
        User = user;
    }

    public Set<Dish> getDish() {
        return Dish;
    }

    public void setDish(Set<Dish> dish) {
        Dish = dish;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Restaurant getRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        Restaurant = restaurant;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User user) {
        User = user;
    }
}
