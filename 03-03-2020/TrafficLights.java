import java.util.Scanner;
class TrafficLights{
	public static void main(String[] args) throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Red Light");
		System.out.println("2. Yellow Light");
		System.out.println("3. Green Light");
		int input=scan.nextInt();
		try{
		switch(input){
			case 1:
				System.out.println("stop");
				break;
			case 2:
				System.out.println("ready");
				break;
			case 3:
				System.out.println("go");
				break;
			default:
				throw new java.io.IOException("error");
		}

	}
	catch(java.io.IOException ae){
		System.out.println("Your entry is invalid");
	}
	}
}