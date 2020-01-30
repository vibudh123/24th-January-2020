import java.util.Scanner;
class palindrome{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();

		boolean flag= false;
		char []arr= str.toCharArray();
		char []arr1= new char[arr.length];
		for(int i=arr.length-1;i>=0;i--){
			arr1[i]=arr[arr.length-i-1];

		}
		for(int j=0;j<arr.length-1;j++){
			if(arr[j]!=arr1[j]){
				//System.out.println("Not a palindrome");
				flag=false;
				break;
			}
			flag= true;
		}
		if(flag==true){
		
		System.out.println("It is a palindrome");
		
		}
		else{
			System.out.println("not a palindrome");
		}
		
	}
}