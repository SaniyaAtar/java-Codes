
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