package Donguler.Practices;
import Donguler.Whiles;

import java.util.Scanner;
public class SadeceGirilenTekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k, total = 0,number = 0;

        do {
            System.out.println("Sayı Giriniz : ");
            k = input.nextInt();

            if (k % 2 == 1) {
                total += k;
                ++number;

            }
        }while (k >0); // çalışma sürekliliğini sağlayan şart. dışına çıkıldığı taktirde işlem tekrarı durur.

        double average = total / number;

        System.out.println("Topam değer : " +total);
        System.out.println("Tek Sayı adeti: " +number);
        System.out.println("Tek sayılarının ortalaması : " +average);

    }
}
