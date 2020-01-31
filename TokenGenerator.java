import java.util.Scanner;
import java.util.StringTokenizer;

class TokenGenerator{
	public static void main(String[] args) {
		int i = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer tokken = new StringTokenizer(str);
		String[] stringArray = new String[20];
		
		while(tokken.hasMoreTokens()){
			stringArray[i] = tokken.nextToken();
			int a  = Integer.parseInt(stringArray[i]);
			sum += a;
			i++;
		}

		System.out.println("Numbers :");
		for(int j=0; j<i; j++){
			System.out.println(stringArray[j] + " ");
		}

		System.out.print("Sum :" + sum);
	}
}