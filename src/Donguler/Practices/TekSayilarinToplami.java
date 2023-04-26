package Donguler.Practices;
import java.util.Scanner;
public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k,total=0,number = 0;

        System.out.println("Sayıyı Giriniz : ");
        k = input.nextInt();

        for (int  i= 0; i <= k; i++){
            if (i % 2 == 1) {
                total += i;  // her döngü tamamlandığında i değeri totale ekleniyor.
                number++; //Döngü Her tamamlandığında 1 artıyor.
                System.out.println("Tek Sayılar : " +i);
            }
        }
        double average = total / number;
        System.out.println(total);
        System.out.println("Ortalaması : " + total/number);
    }
}
