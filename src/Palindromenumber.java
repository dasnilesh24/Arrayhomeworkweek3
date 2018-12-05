import java.util.Scanner;

//  15.	WAP to input any number and check if it is Palindrome or not.
public class Palindromenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int a = s.nextInt();
        int temp = a;
        int rev = 0;
        int rem;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }
        if (a == rev) {
            System.out.println(a + "is palindrome number");

        } else {
            System.out.println(a   + "is not a palindrome number");
        }
    }

}