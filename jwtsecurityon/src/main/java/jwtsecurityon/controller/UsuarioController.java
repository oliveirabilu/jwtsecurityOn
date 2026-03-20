package jwtsecurityon.controller;

import jwtsecurityon.dto.EntradaUsuarioDTO;
import jwtsecurityon.entity.Usuario;
import jwtsecurityon.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    private EntradaUsuarioDTO salvar(@RequestBody EntradaUsuarioDTO dados){
       var user=usuarioRepository.save(new Usuario(dados));
       return new EntradaUsuarioDTO(user);

    }
}
