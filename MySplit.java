import java.util.Scanner;
class MySplit{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String q = scan.nextLine();
		StringBuilder str =new StringBuilder(q);
		String sp= scan.nextLine();
		for(String value : RealSplit(str,sp)){
			System.out.println(value);
		}
	}
	static String[] RealSplit(StringBuilder st,String p){
		int n=1,o=0; 
		int l =p.length();
		for(int x=0;x<st.length()-l;x++){
			if(st.substring(x,x+l)==p)
				n++;
		}
		String []arr=new String[n];
		for(int i=0;i<st.length()-l;i++){
				StringBuilder sat = new StringBuilder();
				if(st.substring(i,i+l)==p){
					arr[o]=st.substring(0,i);
					o++;
					//arr[o]=st.substring(i+l,n);
					st.delete(0,i+l);
				}
				//System.out.println(arr[]);
		}
		return arr;
	}
}
