package Restaurant.Restaurant.Order.Model;

import Restaurant.Restaurant.Dish.singleDish.Model.Dish;
import Restaurant.Restaurant.Restaurant.Model.Restaurant;
import Restaurant.Restaurant.User.Model.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderr")
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="Restaurant_id")
    private Restaurant restaurant;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="User_id")
    private User user;

    @ManyToMany(cascade = { CascadeType.ALL })
    private List<Dish> dishes;

    private float price;

    public void addDish(Dish dish){
        this.dishes.add(dish);
    }

    public void removeDish(Dish dish){
        this.dishes.remove(dish);
    }


}
