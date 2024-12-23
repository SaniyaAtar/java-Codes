<<<<<<< HEAD
<<<<<<< HEAD
import java.util.*;
=======

>>>>>>> 4b4fdb5 (all java code)
=======

>>>>>>> 04e28436a46a7e336660124363d5812d8bbf35f3
class Armostrong{
	public static boolean isArm(int number){
		int sum=0;
		int num=number;
		while(num!=0){
			int lastDigit=num%10;
			sum+=(lastDigit*lastDigit*lastDigit);
			num/=10;

		}
		if(sum==number){
			return true;

		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isArm(121));
		System.out.println(isArm(153));

	}
}