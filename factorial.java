import java.util.*;
class Factorial{
	public static void main(String[] args) {
		int var = Integer.parseInt(args[0]);
		System.out.println(fact(var));
	}
	public static int fact(int num){
		if(num==0 || num==1){
			return 1;
		}
		else{
			return num * fact(num-1);
		}
	}
}
