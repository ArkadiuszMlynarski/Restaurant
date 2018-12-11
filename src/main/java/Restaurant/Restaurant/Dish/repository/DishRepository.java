package Restaurant.Restaurant.Dish.repository;

import Restaurant.Restaurant.Dish.Model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {

public Dish findByName(String name);
}
