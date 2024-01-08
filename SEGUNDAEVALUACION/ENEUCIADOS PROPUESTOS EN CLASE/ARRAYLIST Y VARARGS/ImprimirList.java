import java.util.Scanner;
public class ImprimirList {
    public static void main (String[] args) {
        static Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el numero de  argumentos que desea para alamcenar en una lista");
        int cantArgs = sc.nextInt;

        String[] args = new String[cantArgs];

        for (int i = 0; i < cantArgs; i++) {
            System.out.println("Por favor ingrese una palabra");
            args[i] = sc.nextLine();
        }
        imprimirArgs(args);
    }
    public static void imprimirArgs (String... args){
        for (String argumentos: args)
            System.out.println(args);
    }
}