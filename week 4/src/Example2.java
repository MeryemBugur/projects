import java.util.Scanner;


/**
Adım1: Başla
Adım2: Kullanıcıdan 3 sayı al.
Adım3: Eğer sayi1>sayi2 ve sayi1>sayi3 ise yazdır "sayi1 en büyüktür."
Adım4: Eğer sayi2>sayi1 ve sayi2>sayi3 ise yazdır "sayi2 en büyüktür."
Adım5: Eğer sayi3>sayi1 ve sayi3>sayi2 ise yazdır "sayi3 en büyüktür."
Adım6: Aksi takdirde yazdır "Sayıların birbirine üstünlüğü yoktur."
Adım7: Bitir.
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz: ");
        int sayi3 = input.nextInt();
        
        if (sayi1 > sayi2 && sayi1> sayi3) {
            System.out.println(sayi1+ " en büyüktür. ");
        }
        else if (sayi2 > sayi1 && sayi2> sayi3) {
            System.out.println(sayi2+ " en büyüktür.");
        }
        else if (sayi3 > sayi1 && sayi3> sayi2) {
            System.out.println(sayi3+ " en büyüktür.");
        }
        else {
            System.out.println("Sayıların birbirine üstünlüğü yoktur. ");
        }
    }
    
}
