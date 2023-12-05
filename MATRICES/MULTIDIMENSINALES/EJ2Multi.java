public class EJ2Multi {
    public static void main (String []args){
        int [][] notas = {{9, 10, 8}, {9, 10, 8}};
        boolean mismanotas = notas[0].length == notas[1].length;
        if(mismanotas){
            System.out.println("Ambos estudiantes tienen la misma nota");
        }else{
            System.out.println("Los estudiantees tienen notas distinatas");
        }

    }
}