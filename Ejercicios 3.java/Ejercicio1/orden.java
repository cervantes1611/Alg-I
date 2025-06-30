 package Ejercicio1;

import java.util.Scanner;

public class Orden {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca tres números enteros
        System.out.println("¡Hola! Vamos a ordenar tres números enteros.");
        System.out.print("Por favor, introduce el primer número: ");
        int a = scanner.nextInt();
        
        System.out.print("Ahora, introduce el segundo número: ");
        int b = scanner.nextInt();
        
        System.out.print("Y finalmente, introduce el tercer número: ");
        int c = scanner.nextInt();

        // Calculamos el número mayor, el menor y el del medio
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        // Mostramos los números en orden de mayor a menor
        System.out.println("Aquí tienes tus números ordenados de mayor a menor: " + max + ", " + mid + ", " + min);
        
        // Cerramos el escáner para liberar recursos
        scanner.close();
        
        // Mensaje de despedida
        System.out.println("¡Gracias por usar el programa! Que tengas un buen día.");
    }
}

   

