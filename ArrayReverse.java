import java.util.Arrays;

/**
 * ArrayReverse
 */
public class ArrayReverse {

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
<<<<<<< HEAD
<<<<<<< HEAD
        int start=0;
        int end =arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
=======
=======
>>>>>>> 04e28436a46a7e336660124363d5812d8bbf35f3
        int start=0; //index 0 start
        int end =arr.length-1; // index 4 end
        while(start<end){
            int temp=arr[start]; //temp=10 temp=20
            arr[start]=arr[end];// arr[0]=50  arr[1]==40
            arr[end]=temp;//arr[4]=10
            start++; // star=1
            end--; // end=3  
<<<<<<< HEAD
>>>>>>> 4b4fdb5 (all java code)
=======
>>>>>>> 04e28436a46a7e336660124363d5812d8bbf35f3
        }
        System.out.println(Arrays.toString(arr));
    }
}