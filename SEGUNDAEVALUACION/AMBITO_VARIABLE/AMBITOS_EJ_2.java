import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaElementos = new ArrayList<>();

        // Entrada de elementos por el usuario
        System.out.println("Por favor escriba elementos en la lista (Escriba 'fin' si desea terminar)");
        String elemento = sc.nextLine();
        while (!elemento.equalsIgnoreCase("fin")) {
            listaElementos.add(elemento);
            elemento = sc.nextLine();
        }

        // Menú de operaciones
        int opcion;
        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Mostrar la lista");
            System.out.println("2. Agregar un elemento nuevo al ArrayList");
            System.out.println("3. Buscar un elemento y mostrar la posición (o posiciones) en la que se encuentra");
            System.out.println("4. Eliminar un elemento");
            System.out.println("5. Modificar un elemento");
            System.out.println("6. Limpiar la lista");
            System.out.println("7. Ordenar la lista");
            System.out.println("8. Salir del programa");

            System.out.print("Seleccione una opción (1-8): ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    mostrarLista(listaElementos);
                    break;
                case 2:
                    System.out.println("Introduzca un nuevo elemento:");
                    elemento = sc.nextLine();
                    agregarElemento(listaElementos, elemento);
                    System.out.println("El elemento ha sido añadido.");
                    break;
                case 3:
                    System.out.println("Introduzca el elemento que desea buscar:");
                    elemento = sc.nextLine();
                    buscarElemento(listaElementos, elemento);
                    break;
                case 4:
                    eliminarElemento(listaElementos, sc);
                    break;
                case 5:
                    modificarElemento(listaElementos, sc);
                    break;
                case 6:
                    limpiarLista(listaElementos);
                    System.out.println("Lista limpiada.");
                    break;
                case 7:
                    ordenarLista(listaElementos);
                    break;
                case 8:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo por favor.");
                    break;
            }

        } while (opcion != 8);

        sc.close();
    }

    // Métodos de operaciones
    public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("\nLista de elementos:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " " + lista.get(i));
        }
    }

    public static void agregarElemento(ArrayList<String> lista, String elemento) {
        lista.add(elemento);
    }

    public static void buscarElemento(ArrayList<String> lista, String elemento) {
        ArrayList<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).toLowerCase().equals(elemento.toLowerCase())) {
                posiciones.add(i);
            }
        }
        if (!posiciones.isEmpty()) {
            System.out.println("El elemento '" + elemento + "' se encuentra en las posiciones: " + posiciones);
        } else {
            System.out.println("El elemento '" + elemento + "' no se encuentra en la lista.");
        }
    }

    public static void eliminarElemento(ArrayList<String> lista, Scanner sc) {
        System.out.println("Cómo desea eliminar el elemento: por palabra (1) o por índice (2)");
        int opcionEliminar = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        if (opcionEliminar == 1) {
            System.out.println("Introduzca la palabra que desea eliminar:");
            mostrarLista(lista);
            int eliminar = sc.nextInt();
            if (eliminar >= 0 && eliminar < lista.size()) {
                lista.remove(eliminar);
                System.out.println("El elemento ha sido eliminado.");
            } else {
                System.out.println("El índice no es válido.");
            }
        } else if (opcionEliminar == 2) {
            System.out.println("Introduzca el índice del elemento que desea eliminar:");
            int indice = sc.nextInt();
            if (indice >= 0 && indice < lista.size()) {
                lista.remove(indice);
                System.out.println("El elemento ha sido eliminado.");
            } else {
                System.out.println("El índice no es válido.");
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static void modificarElemento(ArrayList<String> lista, Scanner sc) {
        System.out.println("¿Cómo desea modificar: por palabra (1) o por índice (2)?");
        int opcionModificar = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        if (opcionModificar == 1) {
            System.out.println("Introduzca la palabra que desea modificar:");
            String palabra = sc.nextLine().toLowerCase();
            if (lista.contains(palabra)) {
                System.out.println("Introduzca la nueva palabra que quiere añadir:");
                String palabraNueva = sc.nextLine();
                Collections.replaceAll(lista, palabra, palabraNueva);
                System.out.println("La palabra ha sido modificada exitosamente.");
            } else {
                System.out.println("La palabra introducida no se encuentra dentro de la lista.");
            }

        } else if (opcionModificar == 2) {
            System.out.println("Introduzca el índice del elemento que desea modificar:");
            int modificarIndice = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea pendiente
            if (modificarIndice >= 0 && modificarIndice < lista.size()) {
                System.out.println("Introduce la nueva palabra que desea añadir:");
                String palabraNueva = sc.nextLine();
                lista.set(modificarIndice, palabraNueva);
                System.out.println("El elemento introducido ha sido modificado.");
            } else {
                System.out.println("El índice introducido no es válido.");
            }
        }
    }

    public static void limpiarLista(ArrayList<String> lista) {
        lista.clear();
    }

    public static void ordenarLista(ArrayList<String> lista) {
        Collections.sort(lista);
        mostrarLista(lista);
    }
}