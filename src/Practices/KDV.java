package Practices;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        //Bütün değişkenleri buraya gir, sabit de varsa gir toplu dursun.

        double UrunFiyat, KdvOrani = 0.18, Kdvsiz, Kdv;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün fiyatını Giriniz : ");

        UrunFiyat = input.nextDouble();

        Kdvsiz = UrunFiyat * KdvOrani;
        Kdv = UrunFiyat - Kdvsiz;

        System.out.println("Ürünün Kdvsiz Ücreti : " + Kdv);
        System.out.println("Ürünün Kdv Fiyatı : " + Kdvsiz);
    }
}