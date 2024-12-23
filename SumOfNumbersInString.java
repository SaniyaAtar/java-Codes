public class SumOfNumbersInString {
    public static void main(String[] args) {
        String str="ab3cd67F";
        int sum=0;
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                num=num  +(ch-'0');
                System.out.println(ch-'0');
                System.out.println(num);

            }else{
                sum +=num;
                System.out.println(sum);
                num=0;
            }
        }
        sum+=num;
        System.out.println(sum);
    }
}
