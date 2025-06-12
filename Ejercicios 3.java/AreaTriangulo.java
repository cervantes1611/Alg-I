 import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la base del triángulo
        System.out.print("Introduce la base del triángulo (ej. 8.0): ");
        double base = scanner.nextDouble();  // Ejemplo: 8.0

        // Solicitar la altura del triángulo
        System.out.print("Introduce la altura del triángulo (ej. 5.0): ");
        double altura = scanner.nextDouble();  // Ejemplo: 5.0

        // Calcular el área
        double area = (base * altura) / 2;

        // Mostrar el resultado
        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }
}

