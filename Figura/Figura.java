public class Figura {
    public void Calculararea() {
        System.out.println("El area es buena");
    }
}

class Circulo extends Figura {
    @Override
    public void Calculararea() {
        System.out.println("El area del circulo es igual a pi multiplicado por su radio elevado al cuadrado");
    }
}

class Rectangulo extends Figura {
    @Override
    public void Calculararea() {
        System.out.println("El area del rectangula es su base multiplicada por su altura");
    }
}

class Prueba {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Figura figura = new Figura();
        figura.Calculararea();
        circulo.Calculararea();
        rectangulo.Calculararea();
    }

}