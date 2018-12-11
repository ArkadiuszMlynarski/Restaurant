package Restaurant.Restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Restaurant.Restaurant.Restaurant.repository")
public class RestaurantApplication {


    public static void main(String[] args) {
        SpringApplication.run(RestaurantApplication.class, args);
    }
}
