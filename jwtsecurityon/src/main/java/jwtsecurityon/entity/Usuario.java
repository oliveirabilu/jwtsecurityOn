package jwtsecurityon.entity;
import jakarta.persistence.*;
import jwtsecurityon.dto.EntradaUsuarioDTO;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String senha;

    public Usuario() {
    }

    public Usuario(EntradaUsuarioDTO dados){
        this.id=dados.id();
        this.nome=dados.nome();
        this.senha= dados.senha();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
