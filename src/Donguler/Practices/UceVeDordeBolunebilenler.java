package Donguler.Practices;
import java.util.Scanner;
public class UceVeDordeBolunebilenler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k, total = 0, number = 0;

        System.out.print("Sayıyı Giriniz : ");
        k = input.nextInt();

        for(int i = 0; i <= k; i++){
            if((i % 3 == 0) && (i % 4 == 0)){

                total += i;
                number++;
                System.out.println("Bölünebilen Sayılar : " +i);
            }
        }
        double average = total / number;
        System.out.println("3'e ve 4'e bölünebilen sayı sayısı :  " + number);
        System.out.println("Ortalaması : " + average);

    }
}
