package Tipos;

public class Main {
    public static void main(String[] args) {
        Barco v1 = new Barco("MARCLUB", 12, 120);
        Avion v2 = new Avion("AIRPLANE", 12, 120);
        
        System.out.println("LA ACELERACION ES DE: "+ v1.acelerar());
        System.out.println("LA ACELERACION ES DE: "+ v2.acelerar());
    }
}
