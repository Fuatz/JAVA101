package Donguler;

import java.util.Scanner;

public class Whiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Password;
        int Hak = 3;
        boolean PasswordSucces = true;


        System.out.println("Şifre Giriniz : ");

        while (PasswordSucces) {
            Password = input.nextInt();
            if (Password == 123) {
                System.out.println("Giriş Yaptınız.");
                PasswordSucces = false;
            } else {
                System.out.println("Hatalı giriş yaptınız.");
                System.out.println("Kalan Hakkınız : " + --Hak + "\nŞifreyi Tekrar Giriniz : ");
            }
        }
    }
}
