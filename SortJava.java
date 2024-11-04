import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * SortJava
 */
public class SortJava {
    public static void sortArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
    public static void descSort(int[] arr){

        int i,j;
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
       static void firstHigh(int[] arr){
            descSort(arr);
            System.out.println("First Highest element is  " +arr[0]);

        }
        static void secondHigh(int  arr[]){
            sortArray(arr);
            System.out.println("Second highest element is "+arr[5]);
        }
    public static void main(String[] args) {
        int arr[]={9,3,4,2,5,1,6};
        sortArray(arr);
        descSort(arr);
        firstHigh(arr);
        secondHigh(arr);
    }

}