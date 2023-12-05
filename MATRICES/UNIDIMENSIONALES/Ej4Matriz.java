public class Ej4Matriz {
    public static void main (String [] args){
        
        boolean Encontrado = false;
        int[] numerocadena = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
    
        String buscarnumero = System.console().readLine("Diga un numero de 1 al 10");
        int numerobuscado = Integer.parseInt(buscarnumero);

        for (int Encontrado : numerocadena){
            if (numerobuscado== Encontrado){
                System.out.println("El numero buscad es " + numerobuscado);
                Encontrado = true;
                break;
            }
        }
        if (!Encontrado);{
            System.out.println("No se ha envontrado el numero ");
        }
    }
}