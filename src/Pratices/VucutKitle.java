package Pratices;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, VucutIndeksi;

        System.out.println("Boyunuzu giriniz : ");
        boy = input.nextDouble();

        System.out.println("Kilonuzu giriniz : ");
        kilo = input.nextDouble();
        VucutIndeksi = kilo / (boy * boy);
        System.out.print("Vücut Endeksiniz : " + VucutIndeksi);
    }
}