package Restaurant.Restaurant.Order.service;

import Restaurant.Restaurant.Order.Model.Order;
import Restaurant.Restaurant.Order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository repository;

    @Override
    public void addOrder(Order order){
        repository.save(order);
    }

    @Override
    public List<Order> getAll() { return repository.findAll(); }
}
