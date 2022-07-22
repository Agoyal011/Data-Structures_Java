package apnacollege;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // to calculate the Sum between two numbers

        System.out.println("Enter the first number from where  you would like to start the sum:");

        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();

        System.out.println("Enter the last number where you would like to end the sum: ");
        int i=scan.nextInt();

        int n=i-a;// where n is the no of integers to be added
        int d=1;

        int sum=((n/2)*(2*a+(n-1)*d));

        System.out.println("The required sum  of integers is :"+ sum);

    }
}
