package HerenciaTema6;

public class Estudiante extends Persona{
    

    public Estudiante (String nombre){
        super(nombre);
    }

    @Override
    public boolean esCumpleanyos() {
        boolean esCumple = super.esCumpleanyos();
        if(esCumple){
            //enviar regalo
        }
        return esCumple;
    }
}
