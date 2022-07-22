package apnacollege;

public class Factorial {

    public static void main(String args[]){

        int value=printFactorial(5);

        System.out.println(value);
    }

    public static int printFactorial(int n){

        if(n==1||n==0){
            return 1;
        }

        int calfactorial=printFactorial(n-1);

        int fact_n=n*calfactorial;

        return fact_n;

    }
}
