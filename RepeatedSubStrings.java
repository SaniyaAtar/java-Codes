import java.util.*;
public class RepeatedSubStrings {
    public static int minRepeats(String s1, String s2) {
        for (int i = 0; i < s2.length(); i++) {
            if (!s1.contains("" + s2.charAt(i))) {
                return -1;
            }
        }
        StringBuilder repearedS1 = new StringBuilder(s1);
        int count = 1;

        while (repearedS1.length() < s2.length() * 2) {

            if (repearedS1.toString().contains(s2)) {
                return count;
            }

            repearedS1.append(s1);
            count++;
        }

        if (repearedS1.toString().contains(s2)) {
            return count;
        }

        return -1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1=sc.nextLine();
        System.out.println("Enter string 2");
        String str2=sc.nextLine();
        System.out.printf("to comple string 2 string 1 repeate in %d times" ,minRepeats(str1, str2));
    }
}