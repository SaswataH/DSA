package Functions;

import java.util.*;

public class factorial {

    static int Faktorial(int a) {
        int b = 1;
        while (a > 0) {
            b = b * a;
            a--;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("Enter the number to find factorial");
        a = sc.nextInt();

        int b = Faktorial(a);
        System.out.println("The factorial is " + b);
    }
}
