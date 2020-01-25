import java.util.*;
class Oddnumber{
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		for(int i=num1;i<=num2;i++){
			if(i%2!=0){
				System.out.print(i + " ");
			}
		}
	}
}
