package expertostechdio.lombok.controller;

import expertostechdio.lombok.model.ClientModel;
import expertostechdio.lombok.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<ClientModel>> listAll(){
        return ResponseEntity.ok(clientRepository.findAll());
    }

    @PostMapping("/saveClient")
    public ResponseEntity<ClientModel> save(@RequestBody ClientModel clientModel){
        return ResponseEntity.ok(clientRepository.save(clientModel));
    }
}