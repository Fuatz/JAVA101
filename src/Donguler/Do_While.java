package Donguler;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Password;
        int Hak = 3;
        boolean AskPassword = true;

        do {
            System.out.println("Şifreyi Giriniz : ");
            Password = input.nextInt();
            if (Password == 123) {
                System.out.println("Şifreyi Doğru girdiniz.");
                AskPassword = false;
            } else {
                System.out.println("Kalan Hakkınız : " + --Hak);
            }
        } while (AskPassword);

    }
}
