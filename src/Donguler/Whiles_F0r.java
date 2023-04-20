package Donguler;

import java.util.Scanner;

public class Whiles_F0r {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sayi;
        System.out.print("Sayı Giriniz : ");

        for (boolean run = true; run; ) {
            sayi = input.nextInt();

            if (sayi < 0) {
                run = false;
                System.out.println("Negatif Sayıyı girdiniz.");
            } else {
                run = true;
                System.out.println("Tekrar Sayıyı Giriniz:");
            }
        }


        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }



        /*
        int i;
        boolean AskAgain = true;

        System.out.println("Sayıyı Giriniz :");
        i = input.nextInt();

        while (AskAgain) {
            if (i < 0) {
                System.out.println("Negatif Sayı girildi");
                AskAgain = false;
            } else {
                System.out.println("Tekrar Sayı girinzi : ");
                i = input.nextInt();
            }
        }
        */

//---------------------------------------------------------------------------------------------------------------------
    /*
        int sayi;

        do {
            System.out.println("Sayıyı giriniz : ");
            sayi = input.nextInt();
        } while (sayi > 0); {
            System.out.println("Negatif Sayıyı girdiniz.");
        };

         */



    }
}
