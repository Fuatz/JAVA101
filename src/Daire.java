import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,cevre,alan,pi,a,dilimAlan ;

        System.out.print("Yarı çapı giriniz : ");
        r =input.nextDouble();
        pi = 3.14;
        cevre = 2*pi*r;
        alan = pi*r*r;

        System.out.println("Cevre: " +cevre);
        System.out.println("Alan : " +alan);

        System.out.print("Dilim alanı bulmak için Merkez Açısının ölçüsünü giriniz : ");
        a = input.nextDouble();

        dilimAlan = a*r*pi*r/360;

        System.out.print(dilimAlan);

    }
}