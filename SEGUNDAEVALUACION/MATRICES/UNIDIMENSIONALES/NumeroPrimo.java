import java.util.Scanner;

public class NumeroPrimo{
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Si desea salir en algun momento escriba (Salir)");
        System.out.println("Por favor,  introduzca un numero de 1 al 100, gracias");

        String entrada = sc.nextLine();
        if (entrada.equalsIgnoreCase("salir")){
            
        }

        int primo = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(primo); i++){
            if(primo % i ==0){
                System.out.println("El numero introducido "+ primo + " no es un numero primo ");
            }else{
                System.out.println("El numero introducido "+ primo+ " es un numero primo ");
                return;
            }      
        }
       
    
    }
}
