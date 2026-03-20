package jwtsecurityon.dto;

import jwtsecurityon.entity.Usuario;
import lombok.Data;

@Data
public record EntradaUsuarioDTO(Long id,
                                String nome,
                                String senha) {
    public EntradaUsuarioDTO(Usuario user) {
        this(user.getId(),
                user.getNome(),
                user.getSenha());
    }
}
