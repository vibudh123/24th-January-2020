import java.util.Scanner;
class RealAge{
	public static void main(String[] args) throws MyException{
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		try{
		if(age<15){
			throw new MyException("You are underage");
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