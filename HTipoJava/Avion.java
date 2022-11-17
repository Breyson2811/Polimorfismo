package Tipos;

/**
 *
 * @author usuario
 */
public class Avion implements Vehiculo{
    String marca;
    int velocidad;
    int potmotor;
    
    public Avion(String m, int v, int p){
      marca = m;
      velocidad = v;
      potmotor = p;
    }
    
    @Override
    public int acelerar() {
        return velocidad * potmotor * 10;
    }
}
