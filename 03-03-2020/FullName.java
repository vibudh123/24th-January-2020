import java.util.Scanner;
class FullName{
	public static void main(String[] args) throws MyException{
		Scanner scan = new Scanner(System.in);
		String first_name = scan.nextLine();
		String last_name = scan.nextLine();
		try{
		if(first_name.length()==0 && last_name.length() == 0){
			throw new MyException("Please Enter Full Name");
		}
	}
	catch(MyException me){
		System.out.println(me);
	}
	}
}
class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}