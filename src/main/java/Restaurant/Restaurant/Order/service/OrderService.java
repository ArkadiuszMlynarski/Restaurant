package Restaurant.Restaurant.Order.service;

import Restaurant.Restaurant.Order.Model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    public void addOrder(Order order);

    public List<Order> getAll();


}
