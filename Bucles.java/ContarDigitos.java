 import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long numero = scanner.nextLong(); // Usamos long para permitir números grandes
        int contador = 0;

        // Contamos los dígitos
        do {
            numero /= 10; // Dividimos el número por 10
            contador++;   // Incrementamos el contador
        } while (numero != 0); // Continuamos hasta que el número sea 0

        System.out.println("El número tiene " + contador + " dígitos.");
        scanner.close();
    }
}

