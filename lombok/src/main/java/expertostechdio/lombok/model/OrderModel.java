package expertostechdio.lombok.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tb_order")
@Data
public class OrderModel {

    @Id
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    private ClientModel client;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItemModel> itens;

    public void setId(String id) {
        this.id = id;
    }

}
