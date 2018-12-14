package Restaurant.Restaurant.User.Model;

import lombok.Data;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Users")
public class User  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Role> roles;

    public User(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.roles = user.getRoles();
        this.id = user.getId();

    }



}
