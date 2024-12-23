import java.util.*;
public class MergeArray extends Comman{
    
    public static int[] merge(int[] arr1,int[] arr2){
        int sumArr[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                sumArr[k++]=arr1[i++];
            }else{
                sumArr[k++]=arr2[j++];
            }
        }
        while (i < arr1.length) {
            sumArr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            sumArr[k++] = arr2[j++];
        }

        return sumArr;

        
    }
    public static void main(String[] args) {
     
     int[] a=enterElement();
     int[] b=enterElement();

    System.out.println(Arrays.toString(merge(a,b)));
    }
}
