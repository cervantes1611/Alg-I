 import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los dos números al usuario
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Realizar operaciones
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        
        // Comprobación para evitar división por cero
        if (numero2 != 0) {
            double division = numero1 / numero2;
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        scanner.close();
    }
}

