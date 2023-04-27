package Donguler.Practices;
import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // n! = 1*2*3*4*...n

        System.out.println("Faktoriyelin sonucu bulmak istediğiniz değeri giriniz :  ");
        int n = input.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++){
            total *= i;

        }

        System.out.println( n + "! = "  + total);

        }
    }

