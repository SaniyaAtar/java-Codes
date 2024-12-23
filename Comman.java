import java.util.Arrays;
import java.util.Scanner;

public class Comman {
     public static int[] enterElement(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  list");
        for (int idx = 0; idx < n; idx++) {
            arr[idx]=sc.nextInt();
        }
        return  arr;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,5,4};
        int[] b={6,7,8,9};
        int i=0,j=0,k=0;
        int join[]=new int[a.length+b.length];
        while(i<a.length){
            join[k++]=a[i++];

        }
        while(j<b.length){
            join[k++]=b[j++];
        }
        System.out.println(Arrays.toString(join));
    }
}
