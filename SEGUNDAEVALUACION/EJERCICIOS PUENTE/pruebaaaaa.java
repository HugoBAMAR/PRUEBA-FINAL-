
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


    public class pruebaaaaa {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Usted ha ingresado a su nueva agenda");

            System.out.println("Por favor ingrese el número de personas que desea añadir a la agenda");
            int numPersonas = sc.nextInt();
            sc.nextLine();

            // Array para almacenar los datos de las personas
            String[][] agenda = new String[numPersonas][4];

            // Ingresar la información de cada persona
            for (int i = 0; i < numPersonas; i++) {
                System.out.println("Ingrese la información de la persona " + (i + 1));

                agenda[i][0] = nombApellidosa();
                agenda[i][1] = correoElectronicoa();
                agenda[i][2] = direccionIpa();
                agenda[i][3] = numTelefonoa();
            }

            // Imprimo la agenda con todos los datos
            System.out.println("\nAGENDA");
            for (int i = 0; i < numPersonas; i++) {
                System.out.println("\nUsted ha añadido un total de " + (i + 1) + " personas");
                System.out.println("Nombre y apellidos: " + agenda[i][0]);
                System.out.println("Correo Electrónico: " + agenda[i][1]);
                System.out.println("Dirección IP: " + agenda[i][2]);
                System.out.println("Teléfono: " + agenda[i][3]);
            }
        }

        public static String nombApellidosa() {
            Pattern pattern = Pattern.compile("^[A-Za-z]+([- ][A-Za-z]+)?, [A-Za-z]+([- ][A-Za-z]+)?$");
            String nombreApellidos;

            do {
                System.out.print("Nombre y apellidos: ");
                nombreApellidos = sc.nextLine().trim();
            } while (!pattern.matcher(nombreApellidos).matches());

            return nombreApellidos;
        }

        public static String correoElectronicoa() {
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
            String correo;

            do {
                System.out.print("Correo Electrónico: ");
                correo = sc.nextLine().trim();
            } while (!pattern.matcher(correo).matches());

            return correo;
        }

        public static String direccionIpa() {
            Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            String direccionIP;

            do {
                System.out.print("Dirección IP: ");
                direccionIP = sc.nextLine().trim();
            } while (!pattern.matcher(direccionIP).matches());

            return direccionIP;
        }

        public static String numTelefonoa() {
            Pattern pattern = Pattern.compile("^\\+\\(34\\)\\s\\d{9}$");
            String telefono;

            do {
                System.out.print("Teléfono: ");
                telefono = sc.nextLine().trim();
            } while (!pattern.matcher(telefono).matches());

            return telefono;
        }
    }


