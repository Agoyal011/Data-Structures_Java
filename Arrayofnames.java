package apnacollege;

import java.util.Scanner;

public class Main {

    // taking an array of names as input from the user and printing them on the screen

    public static void main(String[] args) {
	// write your code here

        String names[]=new String[5];

        Scanner scan=new Scanner(System.in);

        for(int i=0;i<4;i++){
            names[i]= scan.nextLine();
        }

        System.out.println("The names entered nby the user were");

        for(int i=0;i<4;i++){
            System.out.println(names[i]);
        }




    }
}
