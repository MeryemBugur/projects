import java.util.Scanner; 

/**
Adım1: Başla
Adım2: Kullanıcıdan 1. sayıyı al.
Adım3: Kullanıcıdan 2. sayıyı al.
Adım4: 
 */
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen birinci sayıyı giriniz: ");
        int x = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int y = input.nextInt();
        int Sonuc = 0;
        int S = 0;
        while (S < x ){
            S = S + 1;
            Sonuc = Sonuc + y;
        }
        System.out.println("Bu iki sayının çarpımı: " + Sonuc );
                
    }
    
}
