class RecursionTest{
    public static void main(String arg[]){
        int n=5;
        printNum(n);
        System.out.println();
        numprint(1);
        System.out.println();
        sumNum(1, 5, 0);
        factorial(3);
    }
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ " ");
        printNum(n-1);

    }
    public static void numprint(int n){
        if(n==6){
            return;
        }
        
        System.out.print(n+" ");
        numprint(n+1);
    }
    public static void sumNum(int i,int n,int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return ;
        }
        sum+=i;
        sumNum(i+1, n, sum);
    }
    public static void factorial(int n){
        if(n==0){
            
            return;
        }
        //System.out.println(n);
        n=n*1;
        factorial(n-1);

    }
}