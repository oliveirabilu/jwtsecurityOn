package jwtsecurityon.dto;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jwtsecurityon.entity.Usuario;
import lombok.Data;

@Data
public record EntradaUsuarioDTO(
        Long id,
        @NotBlank
        String nome,
        @NotBlank
        String senha,
        @Enumerated
        String role) {

    public EntradaUsuarioDTO(Usuario user) {
        this(user.getId(),
            user.getNome(),
            user.getSenha(),
                user.getRole());

    }
}
