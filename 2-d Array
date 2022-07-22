package apnacollege;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the number of rows you want : ");
        int rows=scan.nextInt();

        System.out.println();
        System.out.print("Enter the number of columns you want :");
        int columns=scan.nextInt();
        System.out.println();

        int [][] numbers=new int[rows][columns];

        // input

        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){

                numbers[i][j]= scan.nextInt();

            }
        }

        System.out.println("Enter any number :");

        int x= scan.nextInt();

        System.out.println("The output values are :");
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){

                if(x==numbers[i][j]){

                    System.out.println("Number is located at row " + i +" and column " +j );
                }

                System.out.print(numbers[i][j] + " ");

            }
            System.out.println();
        }


    }
}
