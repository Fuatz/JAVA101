package Pratices;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;
        System.out.println("İlk Sayınızı Giriniz : ");
        n1 = input.nextInt();
        System.out.println("İkinci Sayınızı Giriniz : ");
        n2 = input.nextInt();
        System.out.println("Yapmak İstediğiniz işlemi Seçitiniz : ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme  ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama işlemi : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma işlemi : " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme işlemi : " + (n1 / n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }

            /*
        if (select == 1 ){
            System.out.println("Toplama : " + (n1+n2) );
        } else if (select == 2 ) {
            System.out.println("Çıkarma : " + (n1-n2) );
        } else if ( select == 3 ) {
            System.out.println("Çarpma : " + (n1*n2) );
        } else if(select == 4 ) {
            System.out.println("Bölme : " + (n1/n2) );
        } else System.out.println("Yanlış seçim yaptınız.");
*/
    }
}
