package Restaurant.Restaurant.User.Controller;

import Restaurant.Restaurant.Config.SecurityConfiguration;
import Restaurant.Restaurant.Restaurant.Model.Restaurant;
import Restaurant.Restaurant.Restaurant.repository.RestaurantRepository;
import Restaurant.Restaurant.Restaurant.service.RestaurantService;
import Restaurant.Restaurant.Restaurant.service.RestaurantServiceImpl;
import Restaurant.Restaurant.User.Model.User;
import Restaurant.Restaurant.User.repository.UserRepository;
import Restaurant.Restaurant.User.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class AdminControllerTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Autowired
    private FilterChainProxy springSecurityFilterChain;

    @Autowired
    private WebApplicationContext wac;

    MockMvc mvc;

    @Before
    public void setup() {
//        mvc = MockMvcBuilders.webAppContextSetup(this.wac)
//                .addFilters(this.springSecurityFilterChain).build();
    }

    @Test
    public void getUsersTest(){
        when(userRepository.findAll()).thenReturn(Stream
                .of(new User("Jan","Kowalski","jan123","kowalski456",null), new User("Andrzej","Duda","andrzej123","duda456",null)).collect(Collectors.toList()));
        assertEquals(2, userService.getAll().size());
    }

    @WithMockUser(username="admin",password="admin",authorities = "ROLE_ADMIN")
    @Test
    public void adminHomePage() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/admin/homepage")).andExpect(view().name("adminHomepage"));
    }

    @Test
    public void listUsers() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/listUsers")).andExpect(view().name("/users/listUsers"));
    }

    @Test
    public void editUser() {
    }

    @Test
    public void confirmEditUser() {
    }

    @Test
    public void newUser() {
    }

    @Test
    public void addUser() {
    }

    @Test
    public void removeUser() {
    }
}