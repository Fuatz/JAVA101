package Donguler;

public class Whiles_Continuee {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}
