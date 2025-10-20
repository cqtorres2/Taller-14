public class Figura {
    public void Calculararea() {
        System.out.println("El area es buena");
    }
}

class Circulo extends Figura {
    @Override
    public void Calculararea() {
        System.out.println("El area del circulo es buena");
    }
}

class Rectangulo extends Figura {
    @Override
    public void Calculararea() {
        System.out.println("El area del rectangula son de 4 lados y 4 vertices");
    }
}

class Prueba {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        circulo.Calculararea();
        rectangulo.Calculararea();
    }

}