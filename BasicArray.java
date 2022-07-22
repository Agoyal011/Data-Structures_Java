public class BasicArray {
    // Creates an array, fills it with various integer values and modifies one value and prints them out

    public static void main(String[] args)
    {
        final int LIMIT= 15, MULTIPLE= 10;

        int[] list= new int[LIMIT];// DECLARING AN ARRAY OF INTEGER VALUES
        // Now we have to initialize the array
        for( int index=0;index<LIMIT;index++)
            list[index]=index*MULTIPLE;

        list[5]= 999; // changes one array value

        // printing the array values

        for ( int value: list)
            System.out.println(value+ " ");



    }
}

