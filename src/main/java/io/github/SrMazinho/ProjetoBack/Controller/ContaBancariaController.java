import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@RestController
@RequestMapping("/contas")
public class ContaBancariaController {

    @Autowired
    private ContaBancariaService contaBancariaService;

    @PostMapping("/criar")
    public <ContaBancaria> ResponseEntity<ContaBancaria> criarConta(@RequestBody Usuario usuario) {
        ContaBancaria novaConta = contaBancariaService.criarConta(usuario);
        return new ResponseEntity<>(novaConta, HttpStatus.CREATED);
    }

    @GetMapping("/saldo")
    public ResponseEntity<BigDecimal> obterSaldo(@RequestParam Long contaId) {
        BigDecimal saldo = contaBancariaService.obterSaldo(contaId);
        return saldo != null ?
                new ResponseEntity<>(saldo, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

