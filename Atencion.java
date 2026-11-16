import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Atencion {

    private final Paciente paciente;
    private final Profesional profesional;
    private final ServicioDomiciliario servicio;
    private final List<MedicionDeSignosVitales> mediciones = new ArrayList<>();

    public Atencion(Paciente paciente, Profesional profesional, ServicioDomiciliario servicio) {
        this.paciente = Objects.requireNonNull(paciente, "El paciente no puede ser nulo");
        this.profesional = Objects.requireNonNull(profesional, "El profesional no puede ser nulo");
        this.servicio = Objects.requireNonNull(servicio, "El servicio no puede ser nulo");
    }

    public void programar(Notificacion notificacion) {
        notificacion.enviar(paciente, "Se programó su atención de "
                + servicio.getTipoServicio() + " con " + profesional.getNombre() + ".");
    }

    public void cancelar(Notificacion notificacion) {
        notificacion.enviar(paciente, "Se canceló su atención de "
                + servicio.getTipoServicio() + " con " + profesional.getNombre() + ".");
    }

    public void agregarMedicion(MedicionDeSignosVitales medicion) {
        mediciones.add(Objects.requireNonNull(medicion, "La medición no puede ser nula"));
    }

    public String generarReporte() {
        StringBuilder reporte = new StringBuilder();
        reporte.append("===== REPORTE DE LA ATENCIÓN PRESTADA =====\n");
        reporte.append("Paciente:    ").append(paciente.getNombre()).append('\n');
        reporte.append("Profesional: ").append(profesional.getNombre()).append('\n');
        reporte.append("Servicio:    ").append(servicio.getTipoServicio()).append('\n');
        reporte.append("Signos vitales registrados:\n");
        if (mediciones.isEmpty()) {
            reporte.append("  (ninguno)\n");
        } else {
            for (MedicionDeSignosVitales medicion : mediciones) {
                reporte.append("  - ").append(medicion.getSignoVital())
                        .append(": ").append(medicion.getValor()).append('\n');
            }
        }
        reporte.append("===========================================");
        return reporte.toString();
    }
}
