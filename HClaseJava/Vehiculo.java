package polimorfismo;

/**
 *
 * @author usuario
 */
public class Vehiculo {
    int placa;
    String marca;
    int velocidad;
    
    public Vehiculo(int pl, String brand){
      placa = pl;
      marca = brand;
      velocidad = 0;
    }
    
    public int velocidadMax(){
      return velocidad;
    }
    
    @Override
    public String toString(){
      return "Num Placa "+ placa + "Maraca "+ marca;
    }
}
