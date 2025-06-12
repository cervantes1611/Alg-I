 import java.util.Scanner;

 public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la base del rectángulo
        System.out.print("Introduce la base del rectángulo (ej. 5.5): ");
        double base = scanner.nextDouble();  // Ejemplo: 5.5

        // Solicitar la altura del rectángulo
        System.out.print("Introduce la altura del rectángulo (ej. 3.2): ");
        double altura = scanner.nextDouble();  // Ejemplo: 3.2

        // Calcular el área
        double area = base * altura;  // Ejemplo: 5.5 * 3.2 = 17.6

        // Mostrar el resultado
        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }
}