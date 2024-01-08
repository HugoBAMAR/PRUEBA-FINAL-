package SistemaAcceso;

import java.util.Scanner;
import java.time.LocalDate;

public class AdministrdorSistema {
    private static final Usuario[] USERS = new Usuario[3];
    private static final Scanner sc = new Scanner(System.in);
    public static void main (String[] args){

        Usuario p1 = new Usuario("12345", "Huguete__");
        Usuario p2 = new Usuario("contrasena", "juanitoElKiller");
        Usuario p3 = new Usuario("clase-prog", "bea-la-mejor");
        Usuario p4 = new Usuario("ElputoAmo", "yoSoy...");

        USERS[0] = p1;
        USERS[1] = p2;
        USERS[2] = p3;
        USERS[3] = p4;

        solicitarContrasena();
    }
    public static void solicitarContrasena(){
       Usuario usuarioEscrito = null;
        do{
           System.out.println("USUARIO");
           String user = sc.nextLine();
           System.out.println("CONTRASENA");
           String contr = sc.nextLine();

           usuarioEscrito = comprobarEscrito(user, contr);
       }
    }
    public void comprobarEscrito(){

    }
}