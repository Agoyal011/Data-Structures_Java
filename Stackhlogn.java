package apnacollege;

public class Stackhlogn {

    public static void main(String args[]){
        // to calculate x^n with stack height as logn

        int x=2, n=5;

        int value=calcpower(x,n);
        System.out.println(value);

    }

    public static int calcpower(int x,int n) {

        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        // n is even

        if (n % 2 == 0) {

            return calcpower(x, n / 2) * calcpower(x, n / 2);
        } else// n is odd
        {

            return calcpower(x, n / 2) * calcpower(x, n / 2) * calcpower(x, n);


        }

    }

    }

