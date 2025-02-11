public class StringOperation {
    public static String reverseStr(String str){
            // saniya@atar
            int n=str.length()-1;
            int f=0;
            char[] ch=str.toCharArray();
            while(f<n){
                if(ch[n]=='@'||ch[f]=='&'|| ch[f]=='$'||ch[f]=='!' || ch[f]=='@'|| ch[n]=='$'|| ch[n]=='&'){
                    char temp=ch[f];

                    ch[f]=ch[n-1];
                    ch[n-1]=temp;

                    //continue;
                    f++;
                    n--;

                }else{
                 char temp=ch[f];
                 ch[f]=ch[n];
                 ch[n]=temp;   
                 f++;
                 n--;  
                }  
            }
            return  new String(ch);
        }
        public static void main(String[] args) {
            String str="Sa&niya@at$ar";
            System.out.println(str);
            String s=reverseStr(str);
        System.out.println(s);
    }
}
