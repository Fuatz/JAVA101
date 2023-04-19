package Donguler;

import java.util.Scanner;

public class F0r {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Password, Hak = 3;
        System.out.println("Şifre Giriniz: ");
        for (Hak = 2; Hak >= 0; Hak--) {

            Password = input.nextInt();
            if (Password == 123) {
                System.out.println("Giriş Yaptınız.");
            } else {
                if (Hak != 0) {
                    System.out.println("Hatalı Giriş yaptınız.  \nKalan Hakkınız : " + Hak +
                            "\nŞifrenizi tekrar giriniz : " );
                }else {
                    System.out.println("Hakkınız Kalmadı Daha Sonra Tekrar Deneyin");
                }
            }
        }
    }
}
