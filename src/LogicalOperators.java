import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 10;
        int b = 20;
        int c = 5;

        //AND
        boolean kosul1 = (a < b);
        boolean kosul2 = (a > c);

        boolean and = kosul1 && kosul2;

        System.out.println(and);

        //OR
        boolean sart1 = (a == b);
        boolean sart2 = (a != c);

        boolean or = kosul1 || kosul2;

        System.out.println(or);

        //NOR

        boolean olumsuz1 = (a > b);
        boolean olumsuz2 = (b > c);

        boolean nor = olumsuz1 || olumsuz2;

        System.out.println(!nor);

        // Question Mark Operators

        boolean quest1 = (a == b);
        boolean quest2 = (b > c);

        boolean quest = quest1 || quest2;
        System.out.println(quest ? "Geçti" : "Geçmedi");

    }
}
