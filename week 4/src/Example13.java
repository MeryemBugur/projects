import java.util.Scanner;


/**
Adım1: Başla.
Adım2: Kullanıcıdan bir tamsayı al/oku.
Adım3: Eğer sayi>0 ise yazdır "sayi pozitiftir."
Adım4: Eğer sayi<0 ise yazdır "sayi negatiftir."
Adım5: Aksi halde yazdır "sayi sıfıra eşittir."
Adım6: Bitir.

 */
public class Example13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Lütfen bir tamsayı giriniz: ");
        int sayi = input.nextInt();
        if (sayi>0) {
            System.out.println( sayi + " pozitiftir.");
        }
        else if (sayi<0) {
            System.out.println( sayi + " negatiftir.");
        }
        else  {
        System.out.println(sayi + " sıfırdır.");
    }
                
    }
    
}
