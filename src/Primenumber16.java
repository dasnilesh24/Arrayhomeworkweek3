import java.util.Scanner;

public class Primenumber16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value");
        int myNumber = obj.nextInt();
        boolean prime = true;


        for (int i = 2; i <= myNumber; i++) {

            if (myNumber % i == 0) {
                System.out.println("its  not prime number");

                prime = false;
                break;
            }

        }
        if (prime == true) {
            System.out.println("this is prime number");
        }
    }
}




