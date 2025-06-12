 import java.util.Scanner;

public class ConversorMbAKb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constante de conversión
        final int FACTOR_CONVERSION = 1024;

        // Solicitar al usuario la cantidad de megabytes
        System.out.print("Introduce la cantidad de megabytes (Mb): ");
        double megabytes = scanner.nextDouble();  // Ejemplo: 5

        // Realizar la conversión
        double kilobytes = megabytes * FACTOR_CONVERSION;

        // Mostrar el resultado
        System.out.println(megabytes + " Mb equivalen a " + kilobytes + " Kb");

        scanner.close();
    }
}

