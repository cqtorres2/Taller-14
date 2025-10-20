package Persona;

public class Persona {
    public void Presentarse() {
        System.out.println("Hola");
    }
}

class Estudiante extends Persona {
    @Override
    public void Presentarse() {
        System.out.println("El estudiante saluda");
    }
}

class Profesor extends Persona {
    @Override
    public void Presentarse() {
        System.out.println("El profesor saluda");
    }
}

class main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();
        profesor.Presentarse();
        estudiante.Presentarse();
        persona.Presentarse();

    }
}