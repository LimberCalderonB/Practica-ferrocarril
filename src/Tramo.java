import java.util.Date;

public class Tramo {
    Ciudad origen;
    Ciudad destino;
    Date haraSalida;
    Double duracion;

    public Tramo(Ciudad origen, Ciudad destino, Date haraSalida, Double duracion) {
        this.origen = origen;
        this.destino = destino;
        this.haraSalida = haraSalida;
        this.duracion = duracion;
    }
}
