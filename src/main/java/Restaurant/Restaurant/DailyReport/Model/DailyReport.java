package Restaurant.Restaurant.DailyReport.Model;

import Restaurant.Restaurant.Dish.Product.model.Product;
import Restaurant.Restaurant.User.Model.User;
import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.Order;
import java.time.LocalDateTime;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class DailyReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    private HashMap<String, Float> Dish_price;

    private float profits;

    @OneToMany(mappedBy="dailyReport", cascade=CascadeType.ALL)
    private Set<Product> products;


}
