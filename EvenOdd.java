import java.util.Scanner;

/**
 * EvenOdd
 */
public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number ");
        int n=sc.nextInt();
        // int a=?;
        if((n&1)){
            System.out.println("Number is Even");
        }else{
            System.out.println("odd");
        }

    }
}