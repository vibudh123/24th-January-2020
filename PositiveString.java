import java.util.Scanner;
class PositiveString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("Positive String Verdict : " + Post(str));
	}
	static boolean Post(String st){
		 boolean flag =true;
		 int n = st.length();
		int []arr = new int[n];
		for(int i=0;i<n-1;i++){
			arr[i]=st.charAt(i);
		}

         for(int i=1;i<arr.length;i++){
         	if(arr[i-1]>arr[i]){
         		flag=false;
         	}
         	else{
         		flag=true;
         	}
         }
         return flag;


	}
	
}