package Pratices;

import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double turkce, matematik, fizik, kimya, biyoloji, avarage;

        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        if ((turkce > 100) || (turkce < 0)) {
            System.out.println("Hatalı giriş yaptınız. Ortalamanız hesaplanamadı.");
        }

        System.out.println("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();
        if ((matematik > 100) || (matematik < 0)) {
            System.out.println("Hatalı giriş yaptınız. Ortalamanız hesaplanamadı.");
        }

        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        if ((fizik > 100) || (fizik < 0)) {
            System.out.println("Hatalı giriş yaptınız. Ortalamanız hesaplanamadı.");
        }

        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        if ((kimya < 100) || (kimya > 0)) {
            System.out.println("Hatalı giriş yaptınız. Ortalamanız hesaplanamadı.");
        }

        System.out.println("Biyoloji notunuzu giriniz:");
        biyoloji = input.nextInt();
        if ((biyoloji > 100) || (biyoloji < 0)) {
            System.out.println("Hatalı giriş yaptınız. Ortalamanız hesaplanamadı.");
        }

        avarage = (turkce + matematik + fizik + kimya + biyoloji) / 5;

        if ((turkce >= 75) && (matematik >= 75) && (fizik >= 75) && (kimya >= 75) && (biyoloji >= 75) && (avarage >= 75)) {
            System.out.println("Başarılı, Sınıfı Geçmeyi Başardınız.");
        } else if ((turkce >= 100) || (turkce <= 0) || (matematik >= 100) || (matematik <= 0) || (fizik >= 100) || (fizik <= 0) || (kimya >= 100) || (kimya <= 0) || (biyoloji >= 100) || (biyoloji <= 0)) {
            System.out.println("Hatalı giriş yaptınız. Ortalamanız hesaplanamadı.");
        } else {
            System.out.println("Başarısız.");
        }

        System.out.println("Not ortalamanız : " + avarage);
        ;

    }
}
