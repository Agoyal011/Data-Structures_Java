package apnacollege;

public class Stackheight {

    public static void main(String args[]) {

        // to calculate x^n where n is the stack height.

        int x = 2;
        int n = 5;

        int value=printpower(x, n);
        System.out.println(value);

    }


        public static int printpower(int x,int n){

        if(n==0){

            return 1;
        }
        if(x==0){
            return 0;
        }

        int xPowern1=printpower(x,n-1);
        int xPower=x*xPowern1;
        return xPower;

    }

}
