package Pratices;
import java.util.Scanner;
public class HavaSicakligineGoreEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.println("Etkinlik için sıcaklık giriniz :");
        heat = input.nextInt();

        if (heat < 5)                      { System.out.println("Kayağa gidiniz.");
        } else if (heat > 5  && heat < 10)  { System.out.println("Sinemaya git");
        } else if (heat > 10 && heat < 15)  { System.out.println("Piknik yada Sinemaya git.");
        } else if (heat > 15 && heat < 25) { System.out.println("Pikniğe git.");
        } else                             { System.out.println("Yüzmeye git.");}

        }
    }

