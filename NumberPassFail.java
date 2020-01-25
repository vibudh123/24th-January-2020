import java.util.*;
class Numberpassfail{
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int sum = num1 + num2 + num3;
		int flag = 0;
		if(num1<40){
			flag = 1;
		}
		if(num2<40){
			flag = 1;
		}
		if(num3<40){
			flag = 1;
		}
		if(sum<125){
			flag = 1;
		}
		if(flag==1){
			System.out.print("FAILING");
		}
		if(flag==0){
			System.out.print("PASSING");
		}
	}
}
