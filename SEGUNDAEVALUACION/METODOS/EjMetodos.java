import java.util.Scanner;

public class EjMetodos {
   
    //formula de areas 
        public static double Areacudrado (double lado){
            return lado * lado;
        }
        public static double Areatriangulo(double base, double altura){
            return (base * altura) / 2;
        }
        public static double Areacirculo (double radio){
            return Math.PI * radio * radio;
        }

        //formula de volumenes 
        public static double calcularVolumenCubo(double lado) {
            return Math.pow(lado, 3);
        }
    
        public static double calcularVolumenPiramide(double base, double altura) {
            return (base * base * altura) / 3;
        }
    
        public static double calcularVolumenCilindro(double radio, double altura) {
            return Math.PI * Math.pow(radio, 2) * altura;
        }

        
        public static void main (String []args){
        
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Por favor introduzaca que desea calcular area o volumen");
            System.out.println("Escribalo por favor ");
            
            String operacion = sc.nextLine().toLowerCase();

            if (operacion.equals ("area")){
                System.out.println("Por favor introduzca la figura de la que desea calcular el area (triangulo,  circulo,  cuadrado)");

                double resultado = 0.0;

                String figura =sc.nextLine().toLowerCase();
                if(figura.equals("cuadrado")){
                    System.out.println("Introduzaca la logitud del lado del cuadrado ");
                   
                    double ladCuadrado = sc.nextDouble();
                    resultado = Areacudrado(ladCuadrado);
                    
                } else if (figura.equals("triangulo")){
                    System.out.println("Introduzaca primero la base y luego la altura del triangulo ");
                    
                    double alturaTriang = sc.nextDouble();
                    double baseTriang = sc.nextDouble();
                    resultado = Areatriangulo(baseTriang ,alturaTriang);
                } else if (figura.equals("circulo")){
                    System.out.println("Introduzaca la longitud del radio del circulo");
                    
                    double radCirculo = sc.nextDouble();
                    resultado = Areacirculo(radCirculo);
                }
                System.out.println("El area de la figura "+ figura +" introducida es igual a " +resultado);
            }

            if (operacion.equals(volumen)){
                System.out.println("Introduzca la figura figura que desea calcular su area (Cubo, Piramide, Cilindro)");
                String figura = sc.nextLine().toLowerCase();

                double resultado = 0.0;
                if (figura.equals("Cilindro")) {
                    double radCilindro = sc.nextDouble();
                    double alturaCilindro = sc.nextDouble();
                    resultado = calcularVolumenCilindro(radCilindro, alturaCilindro);                   
                } else if (figura.equals("Piramide")){

                    double basePiramide = sc.nextDouble();
                    double alturaPiramide = sc.nextDouble();
                    resultado = calcularVolumenPiramide(basePiramide, alturaPiramide);
                }else if (figura.equals("cubo")){

                    double ladoCubo = sc.nextDouble();
                    resultado = calcularVolumenCubo(ladoCubo);
                }
                 System.out.println("El vloumen de la  figura "+ figura +" introducida es igual a " +resultado);
            }
        }
}