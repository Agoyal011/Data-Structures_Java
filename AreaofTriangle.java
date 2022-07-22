package apnacollege;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // code to print area of a triangle

        System.out.println("Enter the base value in inches of the triangle: ");
        Scanner scan=new Scanner(System.in);
        int base=scan.nextInt();
        System.out.println("Enter the height in inches of the triangle: ");
        int height=scan.nextInt();

        double area= ((0.5) * (base*height));

        System.out.println("Area of the triangle is : "+ area);
        
        
    }
}
