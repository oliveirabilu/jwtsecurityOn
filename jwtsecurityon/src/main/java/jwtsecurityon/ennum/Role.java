package jwtsecurityon.ennum;

public enum Role {
    ADMIN("admin"),
    USER("usuario");
    private String role;

    Role(String role) {
        this.role = role;
    }
}
