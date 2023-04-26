package Practices;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut, elma, domates, muz, patlican, totalFiyat, armutFiyat, elmaFiyat, domatesFiyat, muzFiyat, patlicanFiyat;

        System.out.println("Aldığınız Armutların kilosunu giriniz : ");
        armut = input.nextDouble();
        armutFiyat = 2.14 * armut;

        System.out.println("Aldığınız Elmaların kilosunu giriniz : ");
        elma = input.nextDouble();

        elmaFiyat = elma * 3.67;

        System.out.println("Aldığınız Domateslerin kilosunu giriniz : ");
        domates = input.nextDouble();

        domatesFiyat = domates * 1.11;

        System.out.println("Aldığınız Muzların kilosunu giriniz : ");
        muz = input.nextDouble();
        muzFiyat = 0.95 * muz;

        System.out.println("Aldığınız Patlıcanların kilosunu giriniz : ");
        patlican = input.nextDouble();
        patlicanFiyat = patlican * 5;

        totalFiyat = patlicanFiyat + muzFiyat + domatesFiyat + elmaFiyat + armutFiyat;
        System.out.println("ürünların toplam fiyatı : " + totalFiyat);
    }

}