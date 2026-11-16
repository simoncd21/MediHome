import java.util.Objects;

public class MedicionDeSignosVitales {

    private final String signoVital;
    private final String valor;

    public MedicionDeSignosVitales(String signoVital, String valor) {
        this.signoVital = Objects.requireNonNull(signoVital, "El signo vital no puede ser nulo");
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser nulo");
    }

    public String getSignoVital() {
        return signoVital;
    }

    public String getValor() {
        return valor;
    }
}
