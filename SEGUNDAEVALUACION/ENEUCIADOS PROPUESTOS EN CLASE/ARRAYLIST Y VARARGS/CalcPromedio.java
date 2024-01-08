import java.util.Scanner;
public class CalcPromedio {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que desea ingresar, por favor");
        int cantPromedios = sc.nextInt();

        double[] numeros = new double[cantPromedios];

        for (int i = 0; i < cantPromedios; i++) {
            System.out.println("Ingrese el " + (i + 1) + "º numero");
            numeros[i] = sc.nextDouble();
        }
        double promedio = calculoPromedio(numeros);
        System.out.println("El promedio de dichos numeros es " + promedio);
    }



    public static double calculoPromedio (double... numeros){
        double suma= 0.0;

        if (numeros.length == 0){
            return 0.0;
        }
        for (double numero :numeros){
            suma += numero;
        }
        return suma/numeros.length;

    }
}