import java.util.Scanner;
class Rev{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String st="";
		for(int i=str.length()-1;i>=0;i--){
			st+=str.charAt(i);
		}
		System.out.println(st);
	}
}