class Fibonocci{
	public static void main(String[] args) {
		int sum = 1;
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2 + " " + num2 + " ");
		while(true){
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
			if(sum<=89){
				System.out.print(sum + " ");
			}
			else{
				break;
			}
		}
	}
}
