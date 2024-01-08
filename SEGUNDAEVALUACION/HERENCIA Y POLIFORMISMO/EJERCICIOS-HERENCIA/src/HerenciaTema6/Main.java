package HerenciaTema6;

public class Main {
    public static void main (String[] args){
        Persona p1 = new Persona("juan");
        Persona p2 = new Persona("Elena", 3);
        Persona p3 = new Persona("Manloi");
        Estudiante E1 = new Estudiante("Bea");

        p1.setNombre("Pepe");


        System.out.println(p1.getNombre() + p2.getNombre() + p3.getNombre() + E1.getEdad());

    }
}
