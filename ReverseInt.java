import java.util.Arrays;

public class ReverseInt {
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6,7,8};
        int end=n.length-1;
        int start = 0;
        while (start < end) {
            int temp = n[start];
            n[start] = n[end];
            n[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(n));
    }
}