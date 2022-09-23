import java.util.Date;

public class Reserva {
    String localizador;
    Date fechaEmicion;
    Ciudad ciudadOrigen;
    Ciudad ciudadDestino;

    public Reserva(String localizador, Date fechaEmicion, Ciudad ciudadOrigen, Ciudad ciudadDestino) {
        this.localizador = localizador;
        this.fechaEmicion = fechaEmicion;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
    }
}
