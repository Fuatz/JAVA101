package Practices;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int Mat, Fizik, Kimya, Turkce, Tarih, Muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz:");
        Mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        Fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        Kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        Turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        Tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:");
        Muzik = input.nextInt();

        int toplam = (Mat + Fizik + Kimya + Turkce + Tarih + Muzik);
        double sonuc = (toplam / 6);

        System.out.println("Not Ortalamanız : " + sonuc);

        System.out.print(sonuc >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");


    }
}
