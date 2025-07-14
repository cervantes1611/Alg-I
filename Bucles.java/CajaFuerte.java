 import java.util.Scanner;

public class CajaFuerte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String combinacionCorrecta = "1234"; // Combinación de la caja fuerte
        int intentos = 4;

        while (intentos > 0) {
            System.out.print("Introduce la combinación de 4 cifras: ");
            String combinacionIngresada = scanner.nextLine();

            if (combinacionIngresada.equals(combinacionCorrecta)) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                return; // Salir del programa
            } else {
                intentos--;
                System.out.println("Lo siento, esa no es la combinación. Te quedan " + intentos + " intentos.");
            }
        }

        System.out.println("Has agotado todos los intentos. Acceso denegado.");
        scanner.close();
    }
}

