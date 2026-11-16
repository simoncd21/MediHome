public class Main {

    public static void main(String[] args) {

        Paciente paciente = new Paciente("Ana Gómez", "ana.gomez@correo.com", "3001112233");
        Profesional profesional = new Profesional("Carlos Ruiz", "carlos.ruiz@medihome.com", "3004445566");
        ServicioDomiciliario servicio = new ServicioDomiciliario("Medicina general");

        paciente.solicitarServicio(servicio);

        Atencion atencion = new Atencion(paciente, profesional, servicio);
        atencion.programar(new NotificacionCorreo());

        MedicionDeSignosVitales medicion = new MedicionDeSignosVitales("Temperatura", "36.8 °C");
        profesional.registrarSignosVitales(atencion, medicion);

        System.out.println();
        System.out.println(atencion.generarReporte());
    }
}
