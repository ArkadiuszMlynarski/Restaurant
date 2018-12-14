package Restaurant.Restaurant.Restaurant.Model;


import lombok.Data;
import java.io.Serializable;
import javax.persistence.*;


@Data
@Entity
@Table(name = "Restaurant")

public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;

}


