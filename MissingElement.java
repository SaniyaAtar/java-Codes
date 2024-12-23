import java.util.*;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  list");
        for (int idx = 0; idx < n; idx++) {
            arr[idx]=sc.nextInt();
        }
        print(arr);
        System.out.println("Missing Element is : "+ missingNumber(arr));
    }
   
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static int missingNumber(int[] arr){
        int n=arr.length +1 ;
        int totalSum= n * (n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum= sum+arr[i];
        }
        return totalSum-sum;
    }
}
