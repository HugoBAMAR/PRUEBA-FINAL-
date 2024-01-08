public class Probamos {

    // Método para calcular el promedio usando VarArgs
    public static double calcularPromedio(double... numeros) {
        if (numeros.length == 0) {
            return 0.0;
        }

        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }

        return suma / numeros.length;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        double promedio1 = calcularPromedio(2.0, 4.0, 6.0, 8.0, 10.0);
        System.out.println("Promedio 1: " + promedio1);

        double promedio2 = calcularPromedio(3.5, 7.0, 10.5);
        System.out.println("Promedio 2: " + promedio2);

        double promedio3 = calcularPromedio(); // Sin argumentos
        System.out.println("Promedio 3: " + promedio3);
    }
}