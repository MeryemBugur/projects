import java.util.Scanner;

/**
Adım1: Başla
Adım2: Kullanıcıdan 1 sayı al.
Adım3: 
 */
public class Example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int n = input.nextInt();
        int sonuc = 0;
        int S = 0;
        while (S<n) {
            S = (S+1)*(S+1);
            sonuc = sonuc + S;
        }
        System.out.println("Karelerinin toplamı: " + sonuc);
    }
    
}
