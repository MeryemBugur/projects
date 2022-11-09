import java.util.Scanner;


/**
 *
 * @author User
 */
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen 1'den 7'ye kadar bir sayı giriniz: ");
        int x = input.nextInt();
        if (x==1) {
            System.out.println("Pazartesi");
        }
        else if (x==2) {
            System.out.println("Salı");
        }
        else if (x==3) {
            System.out.println("Çarşamba");
        }
        else if (x==4) {
            System.out.println("Perşembe");
        }
        else if (x==5) {
            System.out.println("Cuma");
        }
        else if (x==6) {
            System.out.println("Cumartesi");
        }
        else {
            System.out.println("Pazar");
        }
    }
    
}
