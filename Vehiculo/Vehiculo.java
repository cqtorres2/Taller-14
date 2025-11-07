package Vehiculo;

public class Vehiculo {
    public void Mover() {
        System.out.println("El vehiculo se mueve");
    }
}

class Coche extends Vehiculo {
    @Override
    public void Mover() {
        System.out.println("El coche se mueve");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void Mover() {
        System.out.println("La bicicleta se mueve");
    }
}

class main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche();

        vehiculo.Mover();
        bicicleta.Mover();
        coche.Mover();
    }

}