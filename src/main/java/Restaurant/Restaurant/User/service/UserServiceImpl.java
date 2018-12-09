package Restaurant.Restaurant.User.service;

import Restaurant.Restaurant.User.Model.User;
import Restaurant.Restaurant.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository repository;

    @Override
    public void addUser(User user){
        repository.save(user);
    }

    @Override
    public List<User> getAll(){
       return repository.findAll();
    }

    @Override
    public User getByUsername(String username){
        return repository.findByUsername(username);
    }

    @PostConstruct
    public void testwowe(){
        User ww = new User();
        ww.setFirstName("aa");
        ww.setLastName("ww");
        ww.setUsername("afgf");
        ww.setPassword("agg");
        repository.save(ww);
    }

}
