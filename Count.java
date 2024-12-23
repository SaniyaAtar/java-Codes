
import java.util.HashSet;

public class Count {
    public static int strLength(String s){ 

        int n=s.length();
        int maxLength=0;
        int left=0;
        HashSet<Character> set=new HashSet<>();
        for(int rigth=0;rigth<n;rigth++){
            while(set.contains(s.charAt(rigth))){
                set.remove((s.charAt(left)));
                left++;
                System.out.println(set);
            }
            System.out.println(rigth);
            set.add(s.charAt(rigth));
            System.out.println(set);
            maxLength=Math.max(maxLength, rigth-left+1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String s="saniya";
        System.out.println(strLength(s));
    }
    
}
