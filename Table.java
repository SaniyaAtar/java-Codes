import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1,n;
        n=sc.nextInt();
        while(i<=10 ){
            System.out.println(i*n);
            i++;
        }
    }
}
