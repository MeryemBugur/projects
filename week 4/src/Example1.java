import java.util.Scanner;


/**
 *
 * @author User
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();
        if (sayi%2 == 0) {
            System.out.println(sayi+ " çift sayıdır. ");
        }
        else {
            System.out.println(sayi+ " tek sayıdır. ");
        }
        
        
    }
    
}

