public class Boleto {
    Trayecto trayecto;
    Tramo tramo;
    Integer numeroVagon;
    Integer fila;
    Character posicion;
    Tren tren;

    public Boleto(Trayecto trayecto, Tramo tramo, Integer numeroVagon, Integer fila, Character posicion, Tren tren) {
        this.trayecto = trayecto;
        this.tramo = tramo;
        this.numeroVagon = numeroVagon;
        this.fila = fila;
        this.posicion = posicion;
        this.tren = tren;
    }
}
