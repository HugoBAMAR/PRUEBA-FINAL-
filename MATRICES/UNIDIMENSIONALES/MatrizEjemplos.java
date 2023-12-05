public class MatrizEjemplos{
     public static void main(String [] args) {

        int[] num = {0, 1, 2, 3, 4, 5};
        int acumulado = 0;
        

        for ( int i = 0;  i < num.length; i++ ) {
           
            acumulado += num[i];
        }
        System.out.println("La suma total de todos los valores son " + acumulado);

    }
}