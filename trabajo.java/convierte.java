import java.util.Scanner;

public class convierte {

    // Puedes actualizar esta tasa según el tipo de cambio actual
    private static final double TASA_CAMBIO = 4.00; // 1 euro = 4.00 soles (ejemplo)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad en euros: ");
        
        // Validar que el usuario introduce un número válido
        if (scanner.hasNextDouble()) {
            double euros = scanner.nextDouble();
            double soles = euros * TASA_CAMBIO;
            System.out.printf("%.2f euros equivalen a %.2f soles.%n", euros, soles);
        } else {
            System.out.println("Por favor, introduce un número válido.");
        }

        scanner.close();
    }
}

 