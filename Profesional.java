import java.util.Objects;

public class Profesional extends Persona {

    public Profesional(String nombre, String correoElectronico, String telefono) {
        super(nombre, correoElectronico, telefono);
    }


    public void registrarSignosVitales(Atencion atencion, MedicionDeSignosVitales medicion) {
        Objects.requireNonNull(atencion, "La atención no puede ser nula");
        atencion.agregarMedicion(medicion);
    }
}
