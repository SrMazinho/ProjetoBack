import io.github.SrMazinho.ProjetoBack.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario) {
        // Lógica para registrar um novo usuário
        return usuarioRepository.save(usuario);
    }

    public Usuario autenticarUsuario(String nome, String senha) {
        // Lógica para autenticar o usuário
        return usuarioRepository.findByNome(nome)
                .filter(u -> u.getSenha().equals(senha))
                .orElse(null);
    }
}

