package Restaurant.Restaurant.User.Controller;

import Restaurant.Restaurant.User.Model.Role;
import Restaurant.Restaurant.User.Model.User;
import Restaurant.Restaurant.User.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/homepage")
    public String userHomePage(){
        return "homepage";
    }


    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/getByUserName={username}")
    public Optional<User> getByUsername(@PathVariable String username){
        return userService.getByUsername(username);
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }







}
