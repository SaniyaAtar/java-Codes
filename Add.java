<<<<<<< HEAD
class Add{
    // public static int factorial(int num){
    //     int sum=1;
    //     for(int i=1;i<=num;i++){
    //         sum=sum *i;
    //     }

    //     return sum;
    // }


    public static boolean  palindrom(int num){
        int temp=num;
        int sum=0;
        int m;
        
        while(num>0){
            m=num%10;
            sum=sum*10 +m;
            num=num/10;
      }
        if(sum==temp){
            return  true;
        }
        return  false;
    }
    public static boolean palindrom(String str){
       
       char[] ch=str.toCharArray();
       for(int i=0 ,j=ch.length-1;i<j;i++,j--){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
       }
       System.out.println(ch);

       if(str.equals((new String(ch)))){
        return true;
       }

        return false;
    }
    public static void main(String[] args) {
       // System.out.println(palindrom(121));
        System.out.println(palindrom("abc"));

        System.out.println(palindrom("madam"));

    }
}
=======

>>>>>>> 04e28436a46a7e336660124363d5812d8bbf35f3
