import java.util.Scanner;

/**
 *
 * @author User
 */
public class Example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir tamsayı giriniz: ");
        int x = input.nextInt();
        int S=0;
        while (S<=x) {
            S = S+1;
            System.out.println(S);
        }
        
                
    }
    
}
