import java.util.*;
class OddSum{
    public static int oddSum(int n){
        int i=1,sum=0;
        while(i<=n){
            sum=sum+i;
            i+=2;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a=oddSum(55);
        System.out.println(a);
    }
}