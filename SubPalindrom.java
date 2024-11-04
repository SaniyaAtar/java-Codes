import java.util.Scanner;

class SubPalindrom{
    public static boolean palindrom(String str){
    //  System.out.println("your string is    ");
       String rev="";
       for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);
       }
       if(str.equals(rev)){
        return true;
       }else{
        return false;
       }
    }

    public static void main(String args[]){
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        str=sc.nextLine();
        subPalindrom(str.toLowerCase());
    }

    public static void subPalindrom(String str){
    int n=str.length();
    if(n<3){
        System.out.println("Impossible");
        return;
    }
    else if(n==3){
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));

    }
    else{
        for(int i=1;i<n;i++){
            String s1=str.substring(0,i);
            if(palindrom(s1)){
                for(int j=1;j<n;j++){
                    String s2=str.substring(i,i+j);
                    String s3=str.substring(i+j,n);
                    if(palindrom(s2)&&palindrom(s3)){
                        System.out.println(s1);
                        System.out.println(s2);
                        System.out.println(s3);
                        return;

                    }
                }
            }
        }
    }

    System.out.println("Impossible");

    }
}