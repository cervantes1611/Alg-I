package Ejercicio;

import java.util.Scanner;

public class CalculoMediaNotas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las tres notas
        System.out.print("Por favor, introduzca la primera nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Ahora introduzca la segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Finalmente, introduzca la tercera nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular la media
        double media = (nota1 + nota2 + nota3) / 3;

        // Determinar la calificación
        String calificacion;
        if (media >= 1 && media <= 10) {
            calificacion = "Insuficiente";
        } else if (media >= 11 && media <= 12) {
            calificacion = "Suficiente";
        } else if (media >= 13 && media <= 15) {
            calificacion = "Bien";
        } else if (media >= 16 && media <= 20) {
            calificacion = "Notable o Sobresaliente";
        } else {
            calificacion = "Nota fuera de rango";
        }

        // Mostrar el resultado
        System.out.printf("La media de las notas es: %.2f%n", media);
        System.out.println("La calificación es: " + calificacion);

        // Cerrar el scanner
        scanner.close();
    }
}

