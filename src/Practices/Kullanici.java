package Practices;
import java.util.Scanner;
public class Kullanici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id,password,sifirlamak,YeniSifre;

        System.out.print("Kullanıcı Adınızı Giriniz :");
        id = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if (id.equals("patika")&&(password.equals("java123")))
        {System.out.println("Giriş yaptınız.");}
        else {System.out.println("Hatalı Giriş yaptınız. Şifrenizi sıfırlamak için.\n1-Şifremi Unuttum.\n2-Yeniden Giriş Yapmayı dene.");}
        sifirlamak = input.nextLine();
        if (sifirlamak.equals("1"))
        {System.out.print("Yeni Şifrenizi Giriniz :");}
        YeniSifre = input.nextLine();
        if (YeniSifre.equals("java123"))
        {System.out.println("Yeni Şifreniz eski şifrenizle aynı olamaz. ");}
        else {System.out.println("Şifreniz Oluşturuldu.");}


        }
    }

