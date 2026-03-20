package jwtsecurityon.controller;

import jakarta.validation.Valid;
import jwtsecurityon.dto.EntradaUsuarioDTO;
import jwtsecurityon.entity.Usuario;
import jwtsecurityon.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;


    @PostMapping
    private EntradaUsuarioDTO salvar(@RequestBody @Valid EntradaUsuarioDTO dados){
       var user=usuarioRepository.save(new Usuario(dados));
       return new EntradaUsuarioDTO(user);

    }
}
