package Ejercicio;
 import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de horas trabajadas
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        double horasTrabajadas = scanner.nextDouble();

        // Definir las tarifas por hora
        double tarifaOrdinaria = 12.0; // Tarifa por las primeras 40 horas
        double tarifaExtra = 16.0;     // Tarifa por horas extras (a partir de la hora 41)

        // Calcular el salario
        double sueldoSemanal;
        if (horasTrabajadas <= 40) {
            sueldoSemanal = horasTrabajadas * tarifaOrdinaria;
        } else {
            double horasExtra = horasTrabajadas - 40;
            sueldoSemanal = (40 * tarifaOrdinaria) + (horasExtra * tarifaExtra);
        }

        // Mostrar el resultado
        System.out.printf("El sueldo semanal que le corresponde es de %.2f soles.%n", sueldoSemanal);

        // Cerrar el scanner
        scanner.close();
    }
}

