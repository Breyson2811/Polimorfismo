package polimorfismo;

/**
 *
 * @author usuario
 */
public class Barco extends Vehiculo{
    int numHelices;
    
    public Barco(int pl, String mr, int numH, int vel){
      super(pl, mr);
      numHelices = numH;
      velocidad = vel;
    }
    
    @Override
    public int velocidadMax(){
      return velocidad * numHelices;
    }
    
    @Override
    public String toString(){
      return "Marca : "+ marca + "Placa: "+ placa + "VelocidadMax: "+ velocidadMax();
    }
}
