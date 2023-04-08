package Notes;

import java.util.Scanner;
public class ComparisonOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40;


        // Equal Operators
        System.out.println( A == B );
        System.out.println( A == C );
        System.out.println( A == D );

        // Not Equal Operators
        System.out.println(A != B);
        System.out.println(A != C);
        System.out.println(A != D);

        //Greater Operators
        System.out.println(A > B);
        System.out.println(A > C);
        System.out.println(A > D);

        //Greater and Equal Operators
        System.out.println(A >= B);
        System.out.println(A >= C);
        System.out.println(A >= D);

        //Less Operators
        System.out.println(A < B);
        System.out.println(A < C);
        System.out.println(A < D);

        //Less and Equal Operators
        System.out.println(A <= B);
        System.out.println(A <= B);
        System.out.println(A <= B);





    }
}
