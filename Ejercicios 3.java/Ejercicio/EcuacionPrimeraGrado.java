package Ejercicio;

 import java.util.Scanner;

public class EcuacionPrimeraGrado {
    public static void main(String[] args) {
        // Mostrar mensaje inicial
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el valor de a
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = scanner.nextDouble();

        // Solicitar al usuario el valor de b
        System.out.print("Ahora introduzca el valor de b: ");
        double b = scanner.nextDouble();

        // Comprobar si a es cero para evitar división por cero
        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        } else {
            // Calcular el valor de x
            double x = -b / a;
            // Mostrar el resultado
            System.out.printf("La solución de la ecuación es x = %.2f%n", x);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
