import java.util.*;
class FactorialOfNum{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=1;
         while(i<=n){
            sum *=i;
            i++;
         }
         System.out.println(sum);

    }
}