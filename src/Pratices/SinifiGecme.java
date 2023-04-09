package Pratices;
import java.util.Scanner;
public class SinifiGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double turkce,matematik,fizik,kimya,biyoloji,avarage;
        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.println("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        System.out.println("Biyoloji notunuzu giriniz:");
        biyoloji = input.nextInt();


        avarage = (turkce + matematik + fizik + kimya + biyoloji) /5;
        if ((turkce >= 75) && (matematik >= 75) && (fizik >= 75) && (kimya >= 75) && (biyoloji >= 75) && (avarage >=75)) {
            System.out.println("Başarılı, Sınıfı Geçmeyi Başardınız.");
            System.out.println("Not ortalamanız : " +avarage); }

        else {
            System.out.println("Başarısız.");
            System.out.println("Not ortalamanız : " +avarage); ;
        }




    }
}
