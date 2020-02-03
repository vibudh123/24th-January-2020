import java.util.Scanner;
class PrimePlay{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(primeno(n));
	}
	static boolean primeno(int n){
		boolean = false;
		for(int i=2;i<n/2;i++){
			if(n%t==0){
				flag=false;
				break;		}
		}
		else{
			flag=true;
		}
		return flag;
	}
}