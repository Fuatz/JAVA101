package Practices;
import java.util.Scanner;
public class YolYakitMasrafi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, yakitFiyati, yakitSarfiyati, totalYakitFiyati;

        System.out.println("Benzinin litre fiyatını giriniz : ");
        yakitFiyati = input.nextDouble();

        System.out.println("Yakıt Sarfiyatınızı giriniz :");
        yakitSarfiyati = input.nextDouble();

        System.out.println("Gideceğinz yolun km giriniz : ");
        km = input.nextDouble();

        totalYakitFiyati = km * yakitFiyati * yakitSarfiyati / 100;

        System.out.println("Total yakıt masrafınız : " + totalYakitFiyati);

    }
}
