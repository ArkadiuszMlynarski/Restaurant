package Restaurant.Restaurant.service;

import Restaurant.Restaurant.Model.User;
import Restaurant.Restaurant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public void addUser(User user){
        repository.save(user);
    }

    public List<User> getAll(){
       return repository.findAll();
    }

}
