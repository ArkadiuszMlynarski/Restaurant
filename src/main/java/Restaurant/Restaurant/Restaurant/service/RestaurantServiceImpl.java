package Restaurant.Restaurant.Restaurant.service;

import Restaurant.Restaurant.Restaurant.Model.Restaurant;
import Restaurant.Restaurant.Restaurant.repository.RestaurantRepository;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepository repository;

    @Override
    public void addRestaurant(Restaurant restaurant) {

    }

    @Override
    public List<Restaurant> getAll() {
        return repository.findAll();
    }

    @Override
    public Restaurant getByname(String name) {
        return repository.findByName(name);
    }
}
