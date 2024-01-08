import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] arg){
        System.out.println("Usted ha ingresado a su nueva agenda");

        System.out.println("Por favor ingrese el numero de personas que desea añadir a la agenda");
        int numPersonas = sc.nextInt();
        sc.nextLine();

        //Array para almacenar los datos de las personas
        String[][] agenda = new String[numPersonas][4];

        //Ingresar la informacion de cada para cada metodo
        for(int i = 0; i < numPersonas; i++){
            System.out.println("Ingrese la informacion la informacion de la persona " + (i + 1));

            agenda[i][0] = nombApellidos();

            agenda[i][1] = correoElectonico();

            agenda[i][2] = direccionIp();

            agenda[i][3] = numTelefono();
        }

        //impirmo la agenda con todos los datos
        System.out.println("AGENDA");
        for (int i = 0; i < numPersonas; i++){
            System.out.println("Usted ha añadido un total de " + (i + 1) + " personas");
            System.out.println("Nombre y apellidos: " + agenda[i][0]);
            System.out.println("Correo Electronico: " + agenda[i][1]);
            System.out.println("Direccion IP: " + agenda[i][2]);
            System.out.println("Telefono: " + agenda[i][3]);
        }
    }
    //uso un metodo para la informacion de nombres y apellidos
    public static String nombApellidos(){
        System.out.println("Por favor Introduzca los nombres y apellidos de la persona");
        System.out.println("IMPORTANTE, Escribalo de la siguiente manera: Apellido1 Apellido2, Nombre ");
        Pattern patron = Pattern.compile("^[A-Za-z]+([- ][A-Za-z]+)?, [A-Za-z]+([- ][A-Za-z])?$");
        String ApellidosyNombre;

        do {
            System.out.println("Nombre y Apellidos");
            ApellidosyNombre = sc.nextLine().trim();
        } while (!patron.matcher(ApellidosyNombre).matches());
            return ApellidosyNombre;
    }
    //hago el sigioente metodo para el correo electronico
    public static String correoElectonico(){
        System.out.println("Por favor,  ahora Introduzca el correo electronico");
        Pattern patron = Pattern.compile("^[\\w-]+@[A-Za-z0-9]+(\\.[A-Za-z]+)*");
        String gmail;

        do {
            System.out.println("Correo Electronico:");
            gmail = sc.nextLine();
        }while (!patron.matcher(gmail).matches());
        return gmail;
    }
    public static String direccionIp(){
        System.out.println("Por favor ahora introduzca su direccion IP");
        System.out.println("IMPORTANTE: introduzca la direccion IP con el siegiente formato: xxx.xxx.xxx.xxx.");
        Pattern patron = Pattern.compile("^([0-9]{1,3}\\.){3}[0-9]{1,3}");
        String IP;

        do {
            System.out.println("DIRECCION IP");
            IP =sc.nextLine();
        }while(!patron.matcher(IP).matches());
        return IP;
    }
    public static String numTelefono(){
        System.out.println("Por favor, Introduzca el numero de telefono");
        System.out.println("Introduzcalo con el siguiente formato +(34) NUMERO DE TELEFONO");
        Pattern patron = Pattern.compile("^\\+\\(34\\)\\s\\d{9}$");
        String telefono;

        do{
            System.out.println("TELEFONO");
            telefono = sc.nextLine();
        }while(!patron.matcher(telefono).matches());
        return telefono;
    }

}
