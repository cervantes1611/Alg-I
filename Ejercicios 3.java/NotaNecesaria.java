
 import java.util.Scanner;

public class NotaNecesaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la nota del primer examen
        System.out.print("Introduce la nota del primer examen (0-20): ");
        double notaPrimerExamen = scanner.nextDouble();

        // Solicitar la media deseada
        System.out.print("Introduce la media final deseada (0-20): ");
        double mediaDeseada = scanner.nextDouble();

        // Calcular la nota necesaria en el segundo examen
        double notaSegundoExamen = (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6;

        // Mostrar el resultado
        System.out.printf("Para obtener una media de %.2f necesitas sacar %.2f en el segundo examen.\n", 
                           mediaDeseada, notaSegundoExamen);

        scanner.close();
    }
}

