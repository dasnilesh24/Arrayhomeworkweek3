import java.util.Scanner;

public class Sumoflastandfirstnumber13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter five digit number");
        int a= s.nextInt();
        int lastdigit=a%10;
        while (a>10){
            a = a / 10;}

            int firstnumber = a ;
        int total= firstnumber+lastdigit;

        System.out.println("Total of first and last sum is "+ total);


    }
}
