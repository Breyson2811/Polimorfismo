package Tipos;

public class Barco implements Vehiculo {

    String marca;
    int numHelices;
    int velocidad;

    public Barco(String m, int vel, int numH) {
        marca = m;
        velocidad = vel;
        numHelices = numH;
    }

    @Override
    public int acelerar() {
        return velocidad + numHelices * 2;
    }

}
