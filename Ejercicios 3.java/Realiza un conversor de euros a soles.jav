import java.util.Scanner;

public class ConversorEurosASoles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tipo de cambio: 1 euro = 4.00 soles (puedes actualizarlo)
        final double TIPO_CAMBIO = 4.00;

        // Solicitar al usuario la cantidad de euros
        System.out.print("Introduce la cantidad de euros a convertir: ");
        double euros = scanner.nextDouble();

        // Realizar la conversión
        double soles = euros * TIPO_CAMBIO;

        // Mostrar el resultado
        System.out.println(euros + " euros equivalen a " + soles + " soles.");

        // Cerrar el scanner
        scanner.close();
    }
}
