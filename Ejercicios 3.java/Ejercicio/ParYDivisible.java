package Ejercicio;

 import java.util.Scanner;

public class ParYDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca un número
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par
        boolean esPar = (numero % 2 == 0);
        
        // Verificar si el número es divisible entre 5
        boolean esDivisiblePor5 = (numero % 5 == 0);

        // Mostrar resultados
        if (esPar) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }

        if (esDivisiblePor5) {
            System.out.println(numero + " es divisible entre 5.");
        } else {
            System.out.println(numero + " no es divisible entre 5.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

