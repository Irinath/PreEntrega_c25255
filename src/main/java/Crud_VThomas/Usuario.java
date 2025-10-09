package Crud_VThomas;

public class Usuario {

    //Datos del usuario
    private int idUsuario;
    private String tipoDocumento;
    private int nroDocumento;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String mailUsuario;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String apellidoUsuario, int nroDocumento) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;

    }
}
