import java.util.Objects;


public class ServicioDomiciliario {

    private final String tipoServicio;

    public ServicioDomiciliario(String tipoServicio) {
        this.tipoServicio = Objects.requireNonNull(tipoServicio, "El tipo de servicio no puede ser nulo");
    }

    public String getTipoServicio() {
        return tipoServicio;
    }
}
