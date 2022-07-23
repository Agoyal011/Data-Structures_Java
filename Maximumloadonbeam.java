package apnacollege;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // given to us is a 2*4 wooden beam with base=2 inches and height 4 inches

        int d=8; // distance in inches the load is placed from the fixed end.
        int c=2; // one-half of the height in inches.

        int base=2;
        int height=4;

        double i= (base*(height*height*height))*0.083;// to calculate the rectangular moment of inertia
        System.out.println(i);

        int stress=3000;// Stress on the fixed end of the beam

        double l=((stress*i)/(d*c));// max load that can be placed on the beam

        System.out.println("The maximum load that can be placed at the end of the beam is :"+ l);


    }
}
