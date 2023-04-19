package Pratices;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ad,soyad;

        System.out.println("Adınızı Giriniz :");

        ad = input.nextLine();

        System.out.println("Soyadınızı Giriniz :");

        soyad = input.nextLine();

        System.out.print("Ad Soyad: " +ad +soyad);


    }
}
