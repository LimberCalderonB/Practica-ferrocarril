public class Locomotor {
    public Tren tren;
    int codigo;
    //Tren tipo;
public Locomotor(int i){
}

    @Override
    public String toString() {
        return "Locomotor{" +
                "codigo=" + codigo +
                '}';
    }
    public Locomotor(int codigo, Tren tipo) {
        this.codigo = codigo;
        //this.tipo = tipo;

    }
}
