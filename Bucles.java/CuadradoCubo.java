 import java.util.Scanner;

public class CuadradoCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        System.out.printf("%-10s %-10s %-10s%n", "Número", "Cuadrado", "Cubo");
        System.out.println("-------------------------------");

        for (int i = 0; i < 5; i++) {
            int actual = numero + i;
            int cuadrado = actual * actual;
            int cubo = actual * actual * actual;
            System.out.printf("%-10d %-10d %-10d%n", actual, cuadrado, cubo);
        }

        scanner.close();
    }
}
