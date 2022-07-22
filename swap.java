public class swap {
    // Program to swap two variables
    public static void main(String[] args){
        int a=12,b=16;
        System.out.println("The initial value of a is : " + a);
        System.out.println("The initial value of b is : " + b);
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("The swapped value of a is : " +a);
        System.out.println("The swapped value of b is : " +b);
        System.out.println("The value of t is :" +t);

    }
}
