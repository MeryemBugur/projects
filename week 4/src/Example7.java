import java.util.Scanner;


/**
 *
 * @author User
 */
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen 1. kenarın uzunluğunu giriniz: ");
        int x = input.nextInt();
        System.out.println("Lütfen 2. kenarın uzunluğunu giriniz: ");
        int y = input.nextInt();
        System.out.println("Lütfen 3. kenarın uzunluğunu giriniz: ");
        int z = input.nextInt();
        
        if (x == y && y == z ) {
            System.out.println("Üçgen, eşkenar üçgendir. ");
        }
        else if ( x == y || x == z || y == z) {
            System.out.println("Üçgen, ikizkenar üçgendir. ");
        }
        else 
            System.out.println("Üçgen, çeşitkenar üçgendir. ");
            }
    
}
