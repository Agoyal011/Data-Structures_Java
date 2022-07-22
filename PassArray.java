// Passing arrays and individual array elements to methods
public class PassArray {
    // Creates an array and calls ModifyArray and ModifyElement

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println("The values of original array elements are:");

        // output original array elements by using for each

        for (int value : array) {
            System.out.println( value);
        }

        modifyArray(array); // passing array reference to a method
        System.out.println("The values of the modified array are: ");

        // output modified array elements

        for(int value: array) {
            System.out.println(value);
        }
        System.out.println("Effects of passing array element value"+ "array[3] value before modifyElement= "+ array[3]);

        modifyElement(array[3]); // attempt to modify array[3]
        System.out.println("array[3] after modifyElement is "+ array[3]);

        // modify each element of an array by 2
    }

    public static void modifyArray(int[] array2){
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    // multiply the argument by 2

    public static void modifyElement(int element) {
        element*=2;
        System.out.println("Value of element in modifyElement:"+ element);
    }
}
