package HerenciaTema6;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private int edad;
    private LocalDate fechanaciento;


    public Persona(){
        super();
    }
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean esCumpleanyos(){
        //Si es cumpleaños
        return Boolean.TRUE;

    }
}
