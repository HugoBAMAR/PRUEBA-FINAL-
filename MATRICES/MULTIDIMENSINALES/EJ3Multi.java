import java.util.Scanner;



public class EJ3Multi {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
      //usaario ingresa el numero de filas y columnas   
        System.out.println("Por favor dime el numero de columnas que desea para la matriz");
        int fila = sc.nextInt();

        System.out.println("Por favor introduzca el numero fila que desea");
        int columna = sc.nextInt();
        
        int [][] matriz = new int [fila][columna];
        

        System.out.println("Ingrese los elemntos de matriz");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++){
                System.out.println("elemento ["+ i +"] [" + j + "]");
                matriz[i][j] = sc.nextInt();

            }
        }
            System.out.println("La matriz ingresada es ");
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.print(matriz[i][j] +" ");
                }
                    System.out.println(); // Nueva línea para separar las filas
                
            }
    

    }
}