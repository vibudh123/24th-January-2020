import java.util.Scanner;
class CharCheck{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		char c= scan.next().charAt(0);
		char []arr= str.toCharArray();
		for(char a : arr){
			if(c==a){
				System.out.println("Yes it is here");
			}
		}
	}
}