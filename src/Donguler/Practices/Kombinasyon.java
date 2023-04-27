package Donguler.Practices;
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nFak, rFak, nTotal = 1, rTotal = 1,nrTotal = 1;

        System.out.println("\n C(n,r) Kombinasyonu için aşağıdaki değerleri giriniz. ") ;


        //-------------------------------------------------------------------------
        System.out.println("n elemanını giriniz. ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            nTotal *= i;
        }
        System.out.println(n +"! =" + nTotal);
//---------------------------------------------------------------------------
        System.out.println("r elemanını giriniz. ");
        int r = input.nextInt();

        for (int i = 1; i <= r; i++){
            rTotal *= i;
        }
        System.out.println(r +"! =" + rTotal);

 //--------------------------------------------------------------------------
        // C(n,r) = n! / (r! * (n-r)!)
        int nr = n-r;

        for (int i = 1; i <= nr; i++){
            nrTotal *= i;
        }

        double Combinasyon = nTotal / (rTotal * nrTotal) ;

        System.out.println("Kombinasyon sonucu : " + Combinasyon);

    }
}
