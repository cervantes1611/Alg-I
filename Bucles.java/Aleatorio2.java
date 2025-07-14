public class Aleatorio2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("generar al azar piedra,papale o tijera");

        int mano = (int) (Math.random() * 3);


        switch (mano) {
            case 0:
                System.out.println("piedra");
                break;
        case 1:
         System.out.println("papel1");
          
         case 2:
         System.out.println("tijera");
            default:
                break;
                
        }
    }
}
