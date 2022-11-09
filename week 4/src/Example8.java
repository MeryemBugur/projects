import java.util.Scanner;


/**
 *
 * @author User
 */
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir tek sayı giriniz: ");
        int x = input.nextInt();
        int toplam = 0;
        int S = 1;
        while (S<=x) {
            toplam = toplam + S;
            S = S + 2;
            
        }
        System.out.println("Tek sayıların toplamı: " + toplam );
    }
    
}
