import java.util.*;

class LeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0||(year%4==0&&year%100!=0)){
            System.err.println("this year is leap year "+year);
        }else{
            System.out.println("this is not leap year");
        }
    }
}
