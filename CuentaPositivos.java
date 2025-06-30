public class CuentaPositivos {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Ingrese numeros y pulse INTRO");
        System.out.println("para terminar ingrese un numero negativo. ");

        int cuentaNumeros = 0 ;
        int numeroIngresado = 0;
        int suma = 0;

        while (numeroIngresado >= 0) {
            numeroIngresado = Integer.parseInt(System.console().readLine());
            cuentaNumeros++;// cantidad de numeros ingresados
            suma = suma + numeroIngresado; // suma de los numeros ingresados

        }
        System.out.println("Has ingresado "+ (cuentaNumeros-1) + " numeros poaistivos");
        System.out.println("La suma total de ellos es " + (suma + numeroIngresado));
    }
}
