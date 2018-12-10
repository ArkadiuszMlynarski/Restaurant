package Restaurant.Restaurant.User.Controller;

import Restaurant.Restaurant.User.Model.User;
import Restaurant.Restaurant.User.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/get={name}")
    public User getByName(@PathVariable String username){
        return userService.getByUsername(username);
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("test")
    public String test(){
        return "test";
    }






}
