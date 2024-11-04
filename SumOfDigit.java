import java.util.*;
class SumOfDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=Sum(num);
        System.out.println(a);
    }
    public static int Sum(int num){
        int i=0;
        while(num>0){
            i=i+num%10; 
            num /=10;
        }
        return i;
    }
}