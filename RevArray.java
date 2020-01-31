import java.util.*;
class RevArray{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the size");
		int n1 = n.nextInt();
		System.out.print("Elements : ");
		int[] a = new int[n1];
		for(int i=0;i<n1;i++){
			a[i] = n.nextInt();
		}
		int[] ans = new RevArray().sortReverse(a);
		for(int i=0;i<ans.length;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i] + " ");
		}
	}
	public int[] sortReverse(int[] a){
		int[] ew = new int[a.length];
		for(int i=0;i<a.length;i++){
			ew[i] = reverse(a[i]);
		}
		for(int i=0;i<ew.length;i++){
			for(int j=i+1;j<ew.length;j++){
				if(ew[i]>ew[j]){
					int temp  = ew[i];
					ew[i] = ew[j];
					ew[j] = temp;
				}
			}
		}
		return ew;
	}
	public int reverse(int n){
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		int s = Integer.parseInt(sb.toString());
		return s;
	}
}