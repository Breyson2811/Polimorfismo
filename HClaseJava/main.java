package polimorfismo;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(321232, "HYUNDAI");
        Auto v2 = new Auto(12312, "CHEVROLET", 23, 120);
        Barco v3 = new Barco(9999, "MARSUB", 10, 200);
        
        System.out.println("VELOCIDAD MAX DE VEHICULO 1 -> " + v1.velocidadMax());
        System.out.println("VELOCIDAD MAX DE VEHICULO 2 -> " + v2.velocidadMax());
        System.out.println("VELOCIDAD MAX DE VEHICULO 3 -> " + v3.velocidadMax());
        System.out.println("-------------------------");
        System.out.println(v1.toString());
        System.out.println(v2.toString()); 
        System.out.println(v3.toString());
         
    }
}
