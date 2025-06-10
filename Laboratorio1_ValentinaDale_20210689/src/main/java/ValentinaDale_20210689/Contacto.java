package ValentinaDale_20210689;

public class Contacto {

    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    public Contacto(String nombre, String apellido, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Telefono: " + getTelefono() + ", Correo: " + getCorreo();
    }

}
