package apnacollege;

public class Recursion1{

    public static void main(String[] args) {
	// write your code here

        printNumber(5);

    }
    public static void printNumber(int n){

        if(n>0){
            System.out.println(n);
            printNumber(n-1);
        }
    }
}
