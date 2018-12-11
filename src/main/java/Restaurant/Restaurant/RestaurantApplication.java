package Restaurant.Restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("Restaurant.Restaurant.User")
@ComponentScan("Restaurant.Restaurant.Dish")
@ComponentScan("Restaurant.Restaurant.Restaurant")
@ComponentScan("Restaurant.Restaurant.Config")
public class RestaurantApplication {


    public static void main(String[] args) {
        SpringApplication.run(RestaurantApplication.class, args);
    }
}
