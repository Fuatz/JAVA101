package Pratices;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        double a, b, c, Alan, Cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("A Kenarının Değerini Giriniz : ");
        a = input.nextDouble();

        System.out.print("B Kenarının Değerini Giriniz : ");
        b = input.nextDouble();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenus Değeri : " + c);
        Alan = (a * b) / 2;
        Cevre = a + b + c;

        System.out.println("Alan : " + Alan);
        System.out.print("Çevre : " + Cevre);


    }
}