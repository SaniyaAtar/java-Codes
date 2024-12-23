<<<<<<< HEAD
=======
import java.util.*;
>>>>>>> 04e28436a46a7e336660124363d5812d8bbf35f3
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