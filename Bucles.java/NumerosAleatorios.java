 import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generar y mostrar 20 números aleatorios entre 0 y 10
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = random.nextInt(11); // 11 para incluir el 10
            System.out.print(numeroAleatorio + " ");
        }
    }
}
