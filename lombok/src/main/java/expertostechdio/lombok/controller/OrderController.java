package expertostechdio.lombok.controller;

import expertostechdio.lombok.model.OrderModel;
import expertostechdio.lombok.model.ProductModel;
import expertostechdio.lombok.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.hibernate.id.GUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/order")
@AllArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;

    @GetMapping("/listAll")
    public ResponseEntity<List<OrderModel>> listAll() {
        return ResponseEntity.ok(orderRepository.findAll());
    }

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderModel> save(@RequestBody @NonNull OrderModel orderModel) {

        if (orderModel.getId() == null || orderModel.getId().isEmpty()) {
            orderModel.setId(UUID.randomUUID().toString());
        }
        return ResponseEntity.ok(orderRepository.save(orderModel));
    }

}
