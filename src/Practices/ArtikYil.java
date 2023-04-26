package Practices;

import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Year, Plus;

        System.out.println("Yıl giriniz : ");
        Year = input.nextInt();


        Plus = Year % 4;
        if (Plus == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0) {
                    System.out.println( Year + " Artık Bir yıldır. ");
                } else {
                    System.out.println(Year + " Artık Bir yıl değildir.");
                }
            } else {
                System.out.println(Year + " Bir Artık Yıldır.");
            }
        } else {
            System.out.println(Year + " Artık Bir yıl değildir.");
        }
    }
}
