class Pattern
{
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println( );
		}
		for(int i=5;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}

		System.out.println();
	}

	for(int i=0;i<=5;i++){
		for(int j=0;j<5;j++){
			System.out.print("* ");
		}
	
	System.out.println();
	}

	for(int i=0;i<5;i++){
		for(int j=0;j<i;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
System.out.println();
	for(int i=5;i>=0;i--){
		for(int j=0;j<i;j++){
			System.out.print("* ");
		}
		System.out.println();
	}


	for(int i=1;i<=5;i++){
		for(int j=i;j<5;j++){
			System.out.print("  ");
		}
		for(int j=1;j<=i*2-1;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=5;i>0;i--){
		for(int j=5;j>i;j--){
			System.out.print("  ");
		}
		for(int j=0;j<i*2-1;j++){
			System.out.print("* ");
		}
		System.err.println();
	}

	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			if(i==1||i==5||j==1||j==5){
				System.out.print(j+" ");
			}else{
				System.out.print("  ");
			}
		}
		System.out.println();
	}

	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			System.out.print(i +" ");
		}
		System.out.println();
	}
}
}