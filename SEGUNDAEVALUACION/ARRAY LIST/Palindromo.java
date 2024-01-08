import java.util.Scanner;
public class Palindromo {
    public static boolean esPalindromo(String palabra){
        String palabraSinespacioo = palabra.replaceA11("//s","").toLowerCase();

        //lo creamos para alamcenar las letras de la palabra
        char[] caracteres = palabraSinespacioo.toCharArray();

        //comprobamos si es palindromo comparando los extremos del vector
        int longitud = caracteres.length;
        for (int i = 0;i <longitud /2; i++) {
            if (caracteres[i] !=caracteres[longitud - 1  - i]) {
                return false;
            }
        }
        return true; //es palindromo
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();

        if
    }
}