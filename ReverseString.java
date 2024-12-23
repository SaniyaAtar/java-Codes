import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> ch=new Stack<>();
        for(int i=0;i<str.length();i++){
            char item=str.charAt(i);
            ch.push(item);
        }
        StringBuilder a=new StringBuilder();

        while(!ch.isEmpty()){
            a.append(ch.pop());
        }

 
        return new String(a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to revese : ");
        String str=sc.nextLine();
        System.out.println("After reverse : " + reverseString(str));
    }
}
