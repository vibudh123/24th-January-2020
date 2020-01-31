import java.util.Scanner;
class SumCubes
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inp = in.nextInt();
		System.out.println(cubes(inp));
	}
	static int cubes(int nm){
		int sum = 0;
		int num = nm;
		while(num>0)
		{
			int digit = num%10;
			sum+=(digit*digit*digit);
			num = num/10;
		}
		return sum;
	}

}