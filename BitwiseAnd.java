import java.util.Scanner;

/**
 * BitwiseAnd
 */
public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number  ");
        int a=sc.nextInt();
        System.out.print("Enter Number  ");
        int b=sc.nextInt();
        int c=a&b;
        System.out.println(c);
        int d=a|b;
        System.out.println(d);
        int e=a^b;
        System.out.println(e);
        int f=~a;
        System.out.println(f);
        int g=a<<b;
        System.out.println(g);
        int h=a>>b;
        System.out.println(h);

    }
    
}