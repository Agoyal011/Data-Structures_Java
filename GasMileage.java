import java.util.Scanner;

public class GasMileage {
    // Calculates fuel efficiency based on values entered by the user

    public static void main(String[] args) {
        int miles;
        double gallons, mpg;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of miles:");
        miles = scan.nextInt();

        System.out.println("Enter the gallons of fuel used:");
        gallons = scan.nextDouble();

        mpg = miles / gallons;

        System.out.println("Miles per gallon:" + mpg);
    }
}








