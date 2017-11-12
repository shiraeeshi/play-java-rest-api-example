package v1.post;

import javax.persistence.*;

/**
 * Data returned from the database
 */
@Entity
@Table(name = "products")
public class PostData {

    public PostData() {
    }

    public PostData(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;
    public String name;
    public int price;
}
