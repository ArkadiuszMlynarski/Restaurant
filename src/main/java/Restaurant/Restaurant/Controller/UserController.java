package Restaurant.Restaurant.Controller;

import Restaurant.Restaurant.Model.User;
import Restaurant.Restaurant.repository.UserRepository;
import Restaurant.Restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
