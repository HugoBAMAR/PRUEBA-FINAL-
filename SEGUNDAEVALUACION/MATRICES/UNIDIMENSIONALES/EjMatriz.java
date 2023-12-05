public class EjMatriz{
    public static void main (String[] args){
    
    int[] matriz ={4, 51, 69, 112, 57, 654};
    int mayor = matriz[0]; 
        for(int i =1 ; i<matriz.length; i++){
            if (matriz[i]> mayor){
                mayor = matriz[i];
            }
        }
        System.out.println("El numero mas grande es " + mayor);
    }
}