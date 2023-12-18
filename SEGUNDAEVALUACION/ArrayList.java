import java.util.Scanner;
public class ArrayList {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Striing> listaElementos =new ArrayList<>();

        //Entrada de elementos por el usuario
        System.out.println("Por favor escriba elementos en la fila(Escriba 'fin' si desea terminar");
        String elemento = sc.nexLine();
        while (!elemento.equalsIgnoreCase("fin")) {
            listaElementos.add(elemento);
            elemento = sc.nextLine();
        }
        //operaciones
        public static void mostrarlista(ArrayList<String> lista) {
            System.out.println("Lista de elementos");
            for (int i = 0; lista.size(); i++){
                System.out.println(i + " "+lista.get(i));
            }
        }
        public static void agregarElemento(ArrayList<String>, lista, String elemento){
        lista.add(elemnto);
    }
        public static void buscarElemento(ArrayList<String> lista, string elemento){
            ArrayList<Integer> posiciones = new ArrayList<>();
            for(int i =0; i < lista.size(); i++){
                if(lista.get(i).equals(elemento)){
                    posiciones.add(i);
                }
            }
            if!posiciones.isEmpty(){
                System.out.println("El elemnto "+ elemento "se encuentra en las posciones: " + posiciones);
            }else{
                System.out.println("El elemnto "+ elemento" no se encuntra en ninguna de las posiciones ")
            }
        }
        public static void Eliminarelemento (ArrayList<String> lista){
            System.out.println("Por favor Introduxca el elemento que desea eliminar")
                    mostrarlista(listaElementos);
                    int eliminar =sc.nextInt();
                    lista.remove(index =eliminar);
        }

        }
}