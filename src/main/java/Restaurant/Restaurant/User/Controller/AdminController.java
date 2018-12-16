package Restaurant.Restaurant.User.Controller;

import Restaurant.Restaurant.User.Model.User;
import Restaurant.Restaurant.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(("/admin"))
public class AdminController {

    @Autowired
    UserService userService;

    @GetMapping("/homepage")
    public String adminHomePage(Model model){

        model.addAttribute("currentUserName", getCurrentUserName());

        return "adminHomepage";
    }



    @GetMapping("/listUsers")
    public String listUsers(Model model){

        System.out.println(userService.getAll());

        model.addAttribute("currentUserName", getCurrentUserName());
        model.addAttribute("users",userService.getAll());


        return "users/listUsers";
    }

    @GetMapping("/editUser=name")
    public String editUser(@PathVariable Long id, Model model){

        Optional<User> optuser = userService.getById(id);

        if(optuser.isPresent()){
        User user = optuser.get();

        model.addAttribute("Firstname", user.getFirstName());
        model.addAttribute("Lastname",user.getLastName());
        model.addAttribute("Username", user.getUsername());
        model.addAttribute("Password",user.getPassword());
        }

        return "editUser";

    }

    @GetMapping("/removeUser=id")
    public ModelAndView removeUser(@PathVariable Long id, Model model){

        userService.removeUser(id);

        return new ModelAndView("admin/listUsers");
    }



    private String getCurrentUserName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUserName = authentication.getName();
            return currentUserName;
        }
        else{
            return "default";
        }
    }


}
