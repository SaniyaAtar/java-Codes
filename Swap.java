import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Swapping of two number without third variable \n Enter values : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping : a : "+a+" b: "+b );
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a: "+a+" b : "+b);
    }
}
