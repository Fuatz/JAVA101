package Practices;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ClassIsmi = new Scanner(System.in);
        int a,b;

        System.out.println("A sayısını giriniz : ");
        a = ClassIsmi.nextInt();
        System.out.println("B sayısını giriniz : ");
        b = ClassIsmi.nextInt();

        System.out.println("A Sayısı : " + a);
        System.out.println("B Sayısı : " + b);
    }
}
