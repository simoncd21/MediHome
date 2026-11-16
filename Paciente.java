import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Paciente extends Persona {

    private final List<ServicioDomiciliario> serviciosSolicitados = new ArrayList<>();

    public Paciente(String nombre, String correoElectronico, String telefono) {
        super(nombre, correoElectronico, telefono);
    }

    public void solicitarServicio(ServicioDomiciliario servicio) {
        Objects.requireNonNull(servicio, "El servicio no puede ser nulo");
        serviciosSolicitados.add(servicio);
    }

    public List<ServicioDomiciliario> getServiciosSolicitados() {
        return Collections.unmodifiableList(serviciosSolicitados);
    }
}
