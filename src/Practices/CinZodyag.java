package Practices;
import java.util.Scanner;
public class CinZodyag {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil,sonuc;
        System.out.println("Çin Zodyağınızı öğrenmek için doğum yılınızı giriniz : ");
        yil = input.nextInt();
        sonuc = yil % 12;

        switch (sonuc) {
            case 0 :
                System.out.println("Maymun");
                break;
            case 1 :
                System.out.println("Horoz");
                break;
            case 2 :
                System.out.println("Köpek");
                break;
            case 3 :
                System.out.println("Domuz");
                break;
            case 4 :
                System.out.println("Fare");
                break;
            case 5 :
                System.out.println("Öküz");
                break;
            case 6 :
                System.out.println("Kaplan");
                break;
            case 7 :
                System.out.println("Tavşan");
                break;
            case 8 :
                System.out.println("Ejderha");
                break;
            case 9 :
                System.out.println("Yılan");
                break;
            case 10 :
                System.out.println("At");
                break;
            case 11 :
                System.out.println("Koyun");
                break;
        }





        /*
        if (sonuc == 0){
            System.out.println("Maymun");
        } else if (sonuc== 1) {
            System.out.println("Horoz");
        }else if (sonuc == 2) {
            System.out.println("Köpek");
        }else if (sonuc == 3) {
            System.out.println("Domuz");
        }else if (sonuc == 4) {
            System.out.println("Fare");
        }else if (sonuc == 5) {
            System.out.println("Öküz");
        }else if (sonuc == 6) {
            System.out.println("Kaplan");
        }else if (sonuc == 7) {
            System.out.println("Tavşan");
        }else if (sonuc == 8) {
            System.out.println("Ejderha");
        }else if (sonuc == 9) {
            System.out.println("Yılan");
        }else if (sonuc == 10) {
            System.out.println("At");
        }else if (sonuc == 11) {
            System.out.println("Koyun");
        }
*/
    }
}
