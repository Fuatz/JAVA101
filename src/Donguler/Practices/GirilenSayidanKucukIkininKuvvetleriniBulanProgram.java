package Donguler.Practices;

import java.util.Scanner;

public class GirilenSayidanKucukIkininKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

        int k;

        System.out.println("Sayıyı giriniz : ");

        for (int i = 1; i <= 100; i *= 2) {
            System.out.println(i);
        }
    }
}
