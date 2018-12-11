package Restaurant.Restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("Restaurant.Restaurant.Restaurant.repository")
public class RestaurantApplication {


    public static void main(String[] args) {
        SpringApplication.run(RestaurantApplication.class, args);
    }
}
