package Restaurant.Restaurant.User.service;

import Restaurant.Restaurant.User.Model.User;
import Restaurant.Restaurant.User.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    UserService userService;

    @Before
    public void setUp() throws Exception {
        userService = Mockito.mock(UserService.class);
    }

    @Test
    public void addUser() {
        User user = Mockito.mock(User.class);

        userService.addUser(user);
        userService.isUserExist(user);
    }

    @Test
    public void getAll() {



    }

    @Test
    public void getByUsername() {
    }
}