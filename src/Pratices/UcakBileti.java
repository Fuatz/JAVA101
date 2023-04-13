package Pratices;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Distance, PricePerKm = 0.1, Type, Age, Total, TotalDiscount1 = 0.5, TotalDiscount2 = 0.1, TotalDiscount3 = 0.3, TotalDiscount4 = 0.2;

        System.out.println("Gideceğiniz yolculuğun mesafesini giriniz : ");
        Distance = input.nextDouble();

        System.out.println("Gidecek yolcunun yaşını giriniz : ");
        Age = input.nextDouble();

        System.out.println("1- Tek Gidiş\n2- Gidiş Dönüş :");
        Type = input.nextDouble();


        Total = Distance * PricePerKm;

        if ((Distance > 0) && (Age > 0) && (Type == 1 || Type == 2)) {
            if (Age < 12) {
                Total -= Total * TotalDiscount1;
            } else if (Age < 24) {
                Total -= Total * TotalDiscount2;
            } else if (Age < 65) {
                Total -= Total * TotalDiscount3;
            }
            if (Type == 2) {
                Total -= Total * TotalDiscount4;
                Total *= 2;
            }
            System.out.println("Toplam Tutar : " +Total+ "TL");

        }else System.out.println("Hatali Giriş yaptınız");
        System.exit(0);
    }
}
