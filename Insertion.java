public class Insertion {

    public static void printArray(int arr[]){

        for(int j=0;j< arr.length;j++){

            System.out.print(arr[j]);
        }

    }


    public static void main(String[] args) {

        int arr[]={7,8,3,1,2};

        for(int i=1;i<=4;i++){
            int current=i;
            int j=i-1;
            while(j>=0 && arr[current]<arr[j]){

                arr[j+1]=arr[j];
                j--;

            }

            arr[j+1]=current;
        }

        printArray(arr);


    }


}
