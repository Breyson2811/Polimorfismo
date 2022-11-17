#include <iostream>
#include <stdio.h>
#include <string>
class Vehiculo{
  string marca;
  int placa;
  int velocidad;
  public:
    Vehiculo(string, int, int);
    virtual int velocidadMax();     
};

class Auto: public Vehiculo{
  int cabfuerza;
  public:
    Auto(string, int, int, int);
    void velocidadMax();
};

class Tractor: public Vehiculo{
  int cabfuerza;
  int numllantas;
  public:
    Auto(string, int, int, int, int);
    void velocidadMax();
};

Vehiculo:Vehiculo(string m, int pl, int vel){
  marca = m;
  placa = pl;
  velocidad = vel;
}

Auto:Auto(string m, int pl, int vel, int cf):Vehiculo(m,pl,vel){
  cabfuerza = cf;     
}

Tractor:Tractor(string m, int pl, int vel, int cf, int nl):Vehiculo(m,pl,vel){
  cabfuerza = cf;
  numllantas = nl;  
}

int Vehiculo::velocidadMax(){
  return velocidad;
}

int Auto::velocidadMax(){
  return velocidad * cabfuerza;
}

int Tractor::velocidadMax(){
  return velocidad * cabfuerza + numllantas;
}


int main(){

  Vehiculo *v1 = new Vehiculo("TSMI", 12344, 123);
  Auto *v2 = new Auto("CHVRLET", 12323, 160, 15);
  Tractor v3 = new Tractor("TRRTT", 12344, 60, 12, 5);
  std::cout << v1 -> velocidadMax() << std::endl;
  std::cout << v2 -> velocidadMax() << std::endl;
  std::cout << v3 -> velocidadMax() << std::endl; 
}
