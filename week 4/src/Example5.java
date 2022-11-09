import java.util.Scanner;


/**
 *
 * @author User
 */
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Bir sayı giriniz: ");
        double sayi = input.nextDouble();
        if (sayi > 0) {
            System.out.println( sayi + " pozitiftir. ");
        }
        else if ( sayi < 0 ) {
            System.out.println( sayi + " negatiftir. ");
        }
        else {
        System.out.println( sayi + " sıfırdır. ");
    }
        
    
    }
    
}
