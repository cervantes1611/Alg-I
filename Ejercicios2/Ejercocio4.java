package Ejercicios2;

public class Ejercocio4 {
    public static void main(String[] args) {
         
        // Cantidad en soles (puedes modificar este valor)
        double soles = 100.0;

        // Tipo de cambio aproximado (1 EUR = 4.00 PEN)
        double tipoCambio = 4.00;

        // Conversión a euros
        double euros = soles / tipoCambio;

        // Mostrar resultado
        System.out.printf("%.2f soles equivalen a %.2f euros.%n", soles, euros);
    }
}

