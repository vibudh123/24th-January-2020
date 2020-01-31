import java.util.Scanner;
class NumberCheck{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		boolean hey=CheckInc(q);
		if(hey==true){
			System.out.println("Increasing Number");
		}
		else{
			System.out.println("Not an increasing number");
		}
	}
	static boolean CheckInc(int a){
		boolean flag = true;
		int n=0, i=0 , b=a;
		while(b!=0){
			int x=b%10;
			b=b/10;
			n++;
		}
		int []arr = new int[n];
		while(a!=0){
			int y=a%10;
			a=a/10;
			arr[i]=y;
			i++;
		}
		int max=arr[0];
		for(int j=1;j<arr.length;j++){
			if(arr[j]>max){
				flag = false;
			}
		}
		return flag;	
	}
}