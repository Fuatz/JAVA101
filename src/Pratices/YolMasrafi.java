package Pratices;

import java.util.Scanner;
public class YolMasrafi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,yakitFiyati,yakitSarfiyati,totalYakitFiyati;
        yakitFiyati = 22;
        yakitSarfiyati= 8;

        System.out.println("Gideceğinz yolun km giriniz : ");
        km = input.nextDouble();
        totalYakitFiyati = km / 100 * yakitSarfiyati * yakitFiyati ;

        System.out.println("Total yakıt masrafınız : " +totalYakitFiyati);

    }
}