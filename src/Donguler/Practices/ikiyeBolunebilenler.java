package Donguler.Practices;

import java.util.Scanner;

public class ikiyeBolunebilenler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;

        System.out.println("Sayıyı Giriniz.");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


    }
}
