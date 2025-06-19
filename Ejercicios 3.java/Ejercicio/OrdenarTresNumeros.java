package Ejercicio;

 import java.util.Scanner;

public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca tres números
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        // Variables para almacenar los números ordenados
        int menor, medio, mayor;

        // Lógica para ordenar los números
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }

        // Mostrar los números ordenados
        System.out.println("Números ordenados: " + menor + ", " + medio + ", " + mayor);

        // Cerrar el scanner
        scanner.close();
    }
}

