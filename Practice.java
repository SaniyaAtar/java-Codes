import java.util.*;
class Practice{
    public static void bracketCheck(String str){
        Stack<Character> stack=new Stack<>();
        for(char ch :str.toCharArray()){
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            } else if(ch=='}'  || ch==']' || ch==')') {
                if(stack.empty()){
                    System.out.println("String not contain any bracket");
                    return; 
                }
                char openBracket=stack.pop();
                if((ch==']' && openBracket!='[') ||(ch==')' && openBracket !='(') || (ch=='}' && openBracket!='{') ){
                    System.out.println("Bracket is not matching ");
                    return;
                }
            }else if(stack.empty()) {
                System.out.println("No bracket in string ");
                return;
            }
        }
        System.out.println("Bracket Match successfully");
    }

    public void palidromCheck(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse= reverse+ str.charAt(i);
            }
            if(str.equals(reverse)){
                System.out.println("String is Palindrom");
            }else{
                System.out.println("not palindrom");
            }
    }

    public void repeatedChar(String str){
        char[] ch=str.toCharArray();
         boolean[] b=new boolean[str.length()];
        // System.out.println(b);

        for(int i=0;i<ch.length;i++){
           if(b[i])
                 continue;
            int count=0;
            for(int j=0;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    b[j]=true;
                }
            }
            System.out.println(ch[i] +" : "+count);
        }
    }

    public void countChar(String str)
    {
        HashMap<Character, Integer> map=new HashMap<>();
        // for(char c: str.toCharArray()){
        //     map.put(c, map.getOrDefault(c,0)+1);
        //     System.out.println(map);
        // }
        // for (char c:map.keySet()) {
        //     System.out.println(c+":"+map.get(c));
        // }
        int n=str.length();
        char result=0;
        int count=0;
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
            if(count<map.get(c)){
                result=c;
                count =map.get(c);
            }
        }
        System.out.println(result);
    }

    public void maphash(){
        HashMap<Integer ,Character> map=new  HashMap<>();
        map.put(1,'a');
        map.put(2, 'b');
        System.out.println(map.put(3,map.getOrDefault(4, 's')));
        System.out.println(map.get(3));
        //map.remove(3);
        System.out.println(map);
    }

    public static void str(String str){

    //     StringBuffer str1=new StringBuffer();
    //     str1.append(str);
    //    System.out.print( str1.charAt(0));
       StringBuilder s=new StringBuilder();

       s.append(str);
       s.reverse();
       System.out.println(s);
       s.capacity();
       System.out.println(s);
       s.trimToSize();
      
       System.out.println( s.lastIndexOf(str));
       s.repeat(2,3);
       System.out.println(s);

        
    }
}