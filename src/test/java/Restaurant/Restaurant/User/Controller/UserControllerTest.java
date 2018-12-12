package Restaurant.Restaurant.User.Controller;

import Restaurant.Restaurant.User.Model.User;
import Restaurant.Restaurant.User.repository.UserRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Optional;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private UserController userController;


    @Before
    public void setUp() throws Exception {
       mockMvc = MockMvcBuilders.standaloneSetup(userController)
               .build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void userHomePage() throws Exception {

        mockMvc.perform(
                MockMvcRequestBuilders.get("/user/homepage")
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("homepage"));

    }






}