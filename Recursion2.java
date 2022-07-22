package apnacollege;

public class Recursion2 {

    public static void main(String args[]){

        sumNumbers(1,5,0);
    }

    public static void sumNumbers(int i,int n,int sum){



        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }

        sum=sum+i;
        sumNumbers(i+1,n,sum);

    }

}
