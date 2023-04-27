package Donguler.Practices;
import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("hesaplamak istediğiniz üstlü sayının tabanını giriniz : ");
        int n = input.nextInt();

        System.out.println("Hesaplamak istediğiniz üstlü sayının üstünü giriniz : ");
        int k = input.nextInt();

        int total = 1 ;

        for (int i = 1; i <= k; ++i) {
            total *= n;

        }
        System.out.println("Değeriniz : " +total);
    }
}
