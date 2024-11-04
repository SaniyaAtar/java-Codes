import java.util.List;
import java.util.stream.IntStream;

/**
 * ArraySum
 */
public class ArraySum {

    public static int sum(int[] arr){
        int i,sum=0;
        for(i=0;i<arr.length;i++){
             sum=arr[i]+sum;
        }
        return sum;
    }
    // static void removeDouble(int[] arr){
    //     List<Integer> a=IntStream.of(arr);
    //     for(int i=0;i<a.size();i++){
    //         if(a[i]=a[i+1]){
                
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,2,3};
        System.out.println(sum(arr));
    }
}