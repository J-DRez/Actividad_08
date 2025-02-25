package app;

import transporte.Avion;
import transporte.Barco;
import transporte.Bicicleta;
import transporte.Coche;

public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche(180);
        coche.arrancar();
        coche.encenderMotor();
        coche.describir();
        System.out.println();

        Bicicleta bicicleta = new Bicicleta(30);
        bicicleta.arrancar();
        bicicleta.usarFuerzaHumana();
        bicicleta.describir();
        System.out.println();

        Barco barco = new Barco(50);
        barco.arrancar();
        barco.encenderMotor();
        barco.describir();
        System.out.println();

        Avion avion = new Avion(900);
        avion.arrancar();
        avion.encenderMotor();
        avion.describir();
    }
    
}
