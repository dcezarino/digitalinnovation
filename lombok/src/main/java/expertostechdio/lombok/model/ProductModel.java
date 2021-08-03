package expertostechdio.lombok.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "product")
public class ProductModel {

    @Id
    private Integer id;

    private String description;

    private BigDecimal price;

}
