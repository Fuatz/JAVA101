package Pratices;

import java.util.Scanner;

public class Taksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, ucret, acilisUcret = 10, minTutar, toplamtutar;

        System.out.print("Gidilen km bilgisini giriniz : ");
        km = input.nextDouble();
        ucret = (km * 2.2);
        toplamtutar = ucret + acilisUcret;

        System.out.println(ucret >= 20 ? "Ödenecek tutar : " + toplamtutar : "Minimum Ödenecek tutar : 20 ");
    }
}