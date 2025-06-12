 import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tarifa por hora
        final double TARIFA_HORA = 12.0;

        // Solicitar al usuario las horas trabajadas
        System.out.print("Introduce la cantidad de horas trabajadas en la semana: ");
        double horasTrabajadas = scanner.nextDouble();  // Ejemplo: 40

        // Calcular el salario
        double salario = horasTrabajadas * TARIFA_HORA;

        // Mostrar el resultado
        System.out.println("El salario semanal es: S/ " + salario);

        scanner.close();
    }
}

