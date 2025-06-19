package Ejercicio;

 import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el día de nacimiento
        System.out.print("Por favor, introduzca el día de nacimiento (1-31): ");
        int dia = scanner.nextInt();

        // Solicitar al usuario el mes de nacimiento
        System.out.print("Ahora introduzca el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        // Determinar el horóscopo
        String horoscopo = "";

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            horoscopo = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            horoscopo = "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            horoscopo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            horoscopo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            horoscopo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            horoscopo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            horoscopo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            horoscopo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            horoscopo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            horoscopo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            horoscopo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            horoscopo = "Capricornio";
        } else {
            horoscopo = "Fecha inválida. Por favor, verifique los valores ingresados.";
        }

        // Mostrar el resultado
        System.out.println("Tu horóscopo es: " + horoscopo);

        // Cerrar el scanner
        scanner.close();
    }
}

