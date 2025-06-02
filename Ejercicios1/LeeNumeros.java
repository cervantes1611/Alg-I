public class LeeNumeros {
    public static void main(String[] args) {
        //
        String liniea;
        //Mensaje
        System.out.println("Ingrese un numero entero: ");
        //
        liniea=System.console().readLine();
        //
        int numero1;
        numero1 = Integer.parseInt(liniea);
        liniea=System.console().readLine();
        int numero2;
        numero2 = Integer.parseInt(liniea);  
        System.out.println("la suma de ambos numeros es:"+(numero1+numero2));
        

    }
}
