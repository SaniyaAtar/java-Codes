import java.util.Scanner;
import java.util.Stack;

class BracketMatch {
    public static boolean bracketMatch(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;  
                }
                
                char openBracket = stack.pop();
                if ((ch == ')' && openBracket != '(') ||
                    (ch == '}' && openBracket != '{') ||
                    (ch == ']' && openBracket != '[')) {
                    return false; 
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Bracket List");
        String str = sc.nextLine();
<<<<<<< HEAD
        Practice p=new Practice();
        p.bracketCheck(str);
      //  System.out.println("Your Bracket match is : " + bracketMatch(str));
=======
        System.out.println("Your Bracket match is : " + bracketMatch(str));
>>>>>>> 04e28436a46a7e336660124363d5812d8bbf35f3
    }
}
