package Donguler.Practices;

import java.util.Scanner;
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class DortVeBesinKatlari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sınır sayısı giriniz: ");

        int a = input.nextInt(); //sınır sayısı a'dır.

        int i = 1, k = 1;   // 0 yapamazsınız yaparsanız i = i* 4 den sonuc hep 0 cıkar.

        while (i <= a && k <= a) { // üstleri tanımlayan ise i ve k dır.
            System.out.println(i + " " + k);
            i *= 4;
            k *= 5;


        }
    }
}

