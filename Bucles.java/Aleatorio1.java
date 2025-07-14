public class Aleatorio1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Genera 10 numeros aleatorios");

        for (int i  = 0; i  <=  10; i ++) {
            System.out.println((int) (Math.random()) *11 + 20 );
        }
    }
}
