public class probEstud {

        int edad;
        String grado;
        String nombre;
        public probEstud(String nombre, int edad, String grado) {
            this.nombre = nombre;
            this.edad = edad;
            this.grado = grado;
    }
    public void mostrarInformcion() {
        System.out.println("Nombre: "+ nombre );
        System.out.println("Edad: "+ edad);
        System.out.println("Grado: "+ grado );
    }


    public static void main (String[] args){
            probEstud estudiante1 = new probEstud("Juan", 15, "54 grado" );
            probEstud estudiante2 = new probEstud("Hugo", 56, "nvfdivbfdi");

            estudiante1.mostrarInformcion();
            estudiante2.mostrarInformcion();
        }

}