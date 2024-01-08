import java.util.Scanner;
public class ImprimirList {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el numero de  argumentos que desea para alamcenar en una lista");
        int cantArgs = sc.nextInt();
        sc.nextLine();

        String[] argus = new String[cantArgs];

        for (int i = 0; i < cantArgs; i++) {
            System.out.println("Por favor ingrese una palabra");
            argus[i] = sc.nextLine();

        }
        imprimirArgs(argus);
    }
    public static void imprimirArgs (String... args){
        for (String argumentos: args) {
            System.out.println(argumentos);
        }
    }
}