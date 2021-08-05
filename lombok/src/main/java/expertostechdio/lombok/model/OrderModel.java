package expertostechdio.lombok.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tb_order")
public class OrderModel {

    @Id
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    private ClientModel client;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItemModel> itens;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }

    public List<OrderItemModel> getItens() {
        return itens;
    }

    public void setItens(List<OrderItemModel> itens) {
        this.itens = itens;
    }
}
