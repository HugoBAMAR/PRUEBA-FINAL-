import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class EjclaseArrayList {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaElementos = new ArrayList<>();

        //Entrada de elementos por el usuario
        System.out.println("Por favor escriba elementos en la filaEscriba ('fin') si desea terminar");
        String elemento = sc.nextLine();
        while (!elemento.equalsIgnoreCase("fin")) {
            listaElementos.add(elemento);
            elemento = sc.nextLine();
        }
        // Menu de operaciones
        int opcion;
        do {
            System.out.println("\nMenu de Operaciones:");
            System.out.println("1. Mostrar la lista");
            System.out.println("2. Agregar un elemento nuevo al ArrayList");
            System.out.println("3. Buscar un elemento y mostrar la posicion (o posiciones) en la que se encuentra");
            System.out.println("4. Eliminar un elemento");
            System.out.println("5. Modificar un elemento");
            System.out.println("6. Limpiar la lista");
            System.out.println("7. Ordenar la lista");
            System.out.println("8. Salir del programa");

            System.out.println("Seleciona una opcion (1-8)");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarlista(listaElementos);
                    break;
                case 2:
                    System.out.println("Introduzca un nuevo elemento");
                    elemento = sc.nextLine();
                    agregarElemento(listaElementos, sc);
                    System.out.println("El elemento ha sido añadido");
                    break;
                case 3:
                    System.out.println("Introduzca el elemento que desea buscar");
                    elemento = sc.nextLine();
                    buscarElemento(listaElementos, sc);
                case 4:
                    eliminarElemento(listaElementos, sc);
                    break;
                case 5:
                    modificarElemento(listaElementos, sc);
                    break;
                case 6:
                    limpiarLista(listaElementos);
                    System.out.println("La lista ha sido limpiada");
                    break;
                case 7:
                    ordenarLista(listaElementos);
                    break;
                case 8:
                    System.out.println("Salindo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida, Intentalo de nuevo por favor.");
                    break;
            }

        }while (opcion != 8);
    sc.close();
    }
        //metodos de opciones
        public static void mostrarlista(ArrayList<String> lista) {
            System.out.println("\nLista de elementos");
            for (int i = 0; i < lista.size(); i++){
                System.out.println(i + " "+lista.get(i));
            }
        }
        public static void agregarElemento(ArrayList<String> lista, Scanner sc){
        String elemento = sc.nextLine().toLowerCase();
        lista.add(elemento);
        }
        public static void buscarElemento(ArrayList<String> listabuscar, Scanner sc){
            mostrarlista(listabuscar);

            ArrayList<Integer> posiciones = new ArrayList<>();
            for (int i =0; i < listabuscar.size(); i++){
                if(listabuscar.get(i).toLowerCase().equals(elemento.toLowerCase())){
                    posiciones.add(i);
                }
            }
            if(!posiciones.isEmpty()){
                System.out.println("El elemento "+ elemento + " se encuentra en las posciones: " + posiciones);
            }else{
                System.out.println("El elemnto "+ elemento + " no se encuntra en ninguna de las posiciones ");
            }
        }
        public static void eliminarElemento (ArrayList<String> lista, Scanner sc) {
            System.out.println("Como desea eliminar el elemento por palabara(1) o por indice(2)");
            int opcionEliminar = sc.nextInt();

            if (opcionEliminar == 1) {
                System.out.println("Introduzca la palabra que desea eliminar");
                mostrarlista(lista);
                int eliminar = sc.nextInt();
                if (eliminar >= 0 && eliminar < lista.size()){
                lista.remove(eliminar);
                System.out.println("EL elemento ha sido eliminado");
            }else{
                    System.out.println("La palabra introducida no es valida");
            }
                //duda de poner switch para mas eficaz!!!!
        } else if (opcionEliminar == 2){
                System.out.println("Introduce el indice de la palabra que desea eliminar");
                mostrarlista(lista);
                int indice = sc.nextInt();
                if (indice >= 0 && indice <= lista.size()){
                    lista.remove(indice);
                    System.out.println("El elemento ha sido eliminado");
                } else {
                    System.out.println("En indice no es valido");
                }
            }
        }

        public static void modificarElemento(ArrayList<String> lista, Scanner sc) {
            System.out.println("¿Como desea modicar por la palabra(1) o por el indice(2) ");
            int opcionModificar = sc.nextInt();
            sc.nextLine();

            if (opcionModificar == 1) {
                System.out.println("Introduzca la palabra que desea modificar");
                String palabra = sc.nextLine().toLowerCase();
                if (lista.contains(palabra)) {
                    System.out.println("Introduzca la nueva palabra que quiere añadir");
                    String palabraNueva = sc.nextLine();
                    Collections.replaceAll(lista, palabra, palabraNueva);
                    System.out.println("La palabara ha sido modificada exitosamente");
                } else {
                    System.out.println("La palabra introducida no se encuntra dentro de la lista ");
                }

            } else if (opcionModificar == 2) {
                System.out.println("Introduzca el indice del elemento que desea modificar");
                int modificarIndice = sc.nextInt();
                sc.nextLine();
                if (modificarIndice >= 0 && modificarIndice < lista.size()){
                    System.out.println("Introduce la nueva palabra que desea añadir");
                    String palabraNueva = sc.nextLine();
                    lista.set(modificarIndice, palabraNueva);
                    System.out.println("El elemento introducido ha sido modificado");
                } else{
                    System.out.println("El indice introducido no es valido");
                }
            }
        }

        public static void limpiarLista(ArrayList<String> lista){
            lista.clear();
        }
        public static void ordenarLista (ArrayList<String> lista){
        Collections.sort(lista);
        mostrarlista(lista);


    }

    }



