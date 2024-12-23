import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Bracket List");
        String str = sc.nextLine();
        Practice p=new Practice();
        //Practice.bracketCheck(str);
        //p.palidromCheck(str);
        //p.repeatedChar(str);
       //
       // p.countChar(str);
      // p.maphash();

      p.str(str);
    }
}
