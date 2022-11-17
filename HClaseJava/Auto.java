package polimorfismo;

/**
 *
 * @author usuario
 */
public class Auto extends Vehiculo{
    int caballos;
    
    public Auto(int pl, String brnd, int hours, int vel){
      super(pl, brnd);
      caballos = hours;
      velocidad = vel;
    }
    
    @Override
    public int velocidadMax(){
      return velocidad * caballos;
    }
    
    @Override
    public String toString(){
      return "Marca: "+marca+ "Placa: "+ placa + "VelocidadMax: "+ velocidadMax();
    }
}
