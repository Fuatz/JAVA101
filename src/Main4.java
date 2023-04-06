import java.util.Scanner;
public class Main4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String adsoyad,okul;
        int yas;

        System.out.println("Adınızı ve Soyadınızı Giriniz: ");
        adsoyad = input.nextLine();

        System.out.println("Yasınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("Okulunuzu giriniz: ");
        okul = input.nextLine();
        okul = input.nextLine();

        System.out.println(" " +adsoyad );
        System.out.println(" " +yas );
        System.out.println(" " +okul );
    }
}
