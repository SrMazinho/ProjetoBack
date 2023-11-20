import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registrar")
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = usuarioService.registrarUsuario(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }

    @PostMapping("/autenticar")
    public <Usuario> ResponseEntity<Usuario> autenticarUsuario(@RequestParam String nome, @RequestParam String senha) {
        Usuario usuarioAutenticado = usuarioService.autenticarUsuario(nome, senha);
        return usuarioAutenticado != null ?
                new ResponseEntity<>(usuarioAutenticado, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}

