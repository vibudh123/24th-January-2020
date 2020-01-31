import java.util.Scanner;
class Difference{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(diff(scan.nextInt()));
	}
	static int diff(int n){
	int l, k, m; 
    
    l = (n * (n + 1) * (2 * n + 1)) / 6; 

    k = (n * (n + 1)) / 2;
    k = k * k; 
      
    return Math.abs(l-k);
	}
}