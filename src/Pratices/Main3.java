package Pratices;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String adsoyad;
        int yas;

        System.out.println("İsim ve Soyisim giriniz: ");
        adsoyad = input.nextLine();

        System.out.println("Yasınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("İsminiz: " +adsoyad);
        System.out.println("Yasınız: " +yas);

    }
}
