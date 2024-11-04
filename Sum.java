import java.util.Arrays;
import java.util.Scanner;

/**
 * Sum
 */
public class Sum {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size of array  " );
        int n=sc.nextInt();
        System.out.println("enter array element of  size " +n);
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your array is "+Arrays.toString(arr));
     
        int i=0;
        int sum=0;
        while(i<arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println("Sum Of array is " +sum);
        int a=sum/arr.length;
        System.out.println("Avarage is "+a);
    }
}