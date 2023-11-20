import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaBancariaService {

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    public ContaBancaria criarConta(Usuario usuario) {
        // Lógica para criar uma nova conta bancária
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(gerarNumeroConta());
        contaBancaria.setSaldo(BigDecimal.ZERO);
        contaBancaria.setUsuario(usuario);

        return contaBancariaRepository.save(contaBancaria);
    }

    public BigDecimal obterSaldo(Long contaId) {
        // Lógica para obter o saldo de uma conta bancária
        return contaBancariaRepository.findById(contaId)
                .map(ContaBancaria::getSaldo)
                .orElse(null);
    }

    private String gerarNumeroConta() {
        // Lógica para gerar um número de conta único
        // (pode ser um número aleatório ou seguir um padrão específico)
        return UUID.randomUUID().toString();
    }
}
