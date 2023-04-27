package Donguler.Practices;

import java.util.Scanner;

public class CiftVeDordeBolunebilen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k, total = 0, number = 0;

        do {
            System.out.println("Sayı Giriniz");
            k = input.nextInt();

            if (k % 4 == 0) {
                total += k;
                ++number;

            }
        } while (k % 2 == 0);

        double average = total / number;

        System.out.println("4'e Bölünebilen çift sayıların toplamı : " + total);
        System.out.println("4'e Bölünebilen çift sayıların miktarı : " + number);
        System.out.println("4'e Bölünebilen çift sayıların ortalaması : " + average);
    }
}
