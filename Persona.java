public abstract class Persona {

    private final String nombre;
    private final String correoElectronico;
    private final String telefono;

    protected Persona(String nombre, String correoElectronico, String telefono) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }
}
