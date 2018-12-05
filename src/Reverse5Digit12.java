

import java.util.Scanner;

public class Reverse5Digit12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter 5 digit number");
        int a= s.nextInt();

        int rem;
                int rev = 0;
        while (a > 0) {
            rem = a% 10;
            rev = rev * 10 + rem;
            a = a / 10;

        } System.out.println(rev);
    }
}

