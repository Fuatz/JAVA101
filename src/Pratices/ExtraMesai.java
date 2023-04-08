package Pratices;

import java.util.Scanner;
public class ExtraMesai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Maas,AylikCalismaSaati,MesaiSaati,MesaiUcreti;

        System.out.println("Mesai ücretinizi hesaplamak için gerekli değerleri giriniz : ");
        System.out.println("Maaşınız = ");
        Maas = input.nextDouble();
        System.out.println("Aylık Çalışma saatinizi giriniz : ");
        AylikCalismaSaati = input.nextDouble();
        System.out.println("Bu ay ki mesai saatinizi giriniz : ");
        MesaiSaati = input.nextDouble();
        MesaiUcreti = ((Maas / AylikCalismaSaati)* 1.5)*MesaiSaati;
        System.out.println("Mesai ücretiniz : " +MesaiUcreti );
    }
}
