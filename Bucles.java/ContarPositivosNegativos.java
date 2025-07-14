 import java.util.Scanner;

public class ContarPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivos++; // Incrementa si el número es positivo
            } else if (numero < 0) {
                contadorNegativos++; // Incrementa si el número es negativo
            }
        }

        System.out.println("Cantidad de números positivos: " + contadorPositivos);
        System.out.println("Cantidad de números negativos: " + contadorNegativos);

        scanner.close();
    }
}
